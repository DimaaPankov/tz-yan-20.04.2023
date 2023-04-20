package com.gamezzz.screen

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.gamezzz.R
import com.gamezzz.databinding.FragmentGameBinding
import com.gamezzz.presenter.*


class gameFragment : Fragment() {

    var drawable = 0
    var drawable2 = ModelQestion("",true)
    lateinit var animate: AnimationCards
    var clickFirstOnTouch = true

    var time = 0L
    var isVisibleA = true


    val binding by lazy{FragmentGameBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        animate = AnimationCards()
        animate.init(binding.cvback,
            binding.cvtop,
            binding.cvstart,
            binding.CVwin,
            binding.TVtimer,
            binding.Bplay ,
            binding.IVtimer,
            binding.IVsec,
            binding.CVgameScene,
            binding.IVfinger,
            binding.TVtrue,
            binding.TVfalse
        )

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        imageTop2 = listFact.random()
        binding.TVtop.text = imageTop2.fact




        repeat(100){
            Handler(Looper.getMainLooper()).postDelayed({
                if(isVisibleA){

                    val animator1 = ObjectAnimator.ofFloat(binding.Bplay, View.ALPHA, 1F)
                    animator1.duration = 1000L
                    animator1.start()
                    isVisibleA = false

                } else{

                    val animator1 = ObjectAnimator.ofFloat(binding.Bplay, View.ALPHA, 0F)
                    animator1.duration = 1000L
                    animator1.start()
                    isVisibleA = true
                }
            },time)
            time = time +1000L
        }


        binding.CVscene.setOnTouchListener(object : OnSwipeTouchListener(requireContext()){
            override fun onSwipeRight() {
                swipeRight(false)

            }

            override fun onSwipeLeft() {
                swipeLeft(true)

            }

            override fun onSwipeTop() {
            }

            override fun onSwipeBottom() {


            }

            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                if(clickFirstOnTouch) {

                    swipeLeft(true)
                    clickFirstOnTouch = false
                }
                return super.onTouch(v, event)
            }
        })

        return binding.root
    }

    var imageTop2 =ModelQestion("asas",true)


    fun swipeLeft(answerSwipe:Boolean) {
        if(animate.clickTimer){
            animate.startTimer()
            animate.clickTimer = false

        }
        drawable2 = listFact.random()
        binding.TVBottom.text = drawable2.fact

        if (animate.firstClick) {
            Handler(Looper.getMainLooper()).postDelayed({
                animate.startInstructioAnimation()
                binding.Bplay.isVisible = false

            },2000L)
            animate.animationStartCard()
            animate.firstClick = false

        } else {

            animate.animationFrontCardLeft()
            Handler(Looper.getMainLooper()).postDelayed({
                animate.animationBackCard()
                binding.TVtop.text = drawable2.fact

                if(imageTop2.answer == answerSwipe){
                    animate.animmateViewInvisible()
                    Handler(Looper.getMainLooper()).postDelayed({
                        findNavController().navigate(R.id.action_gameFragment_to_vinFragment)

                    },500L)

                }else{
                    ++points
                    binding.TVvin.text = "your win $points points!"

                }
                imageTop2 = drawable2
            }, 500L)


        }
    }


    fun swipeRight(answerSwipe:Boolean) {
        if(animate.clickTimer){
            animate.startTimer()
            animate.clickTimer = false

        }
        drawable = ModelBonus.getRamdomBonus()
        drawable2 = listFact.random()
        binding.TVBottom.text = drawable2.fact

        if (animate.firstClick) {
            animate.animationStartCard()
            animate.firstClick = false

        } else {


            animate.animationFrontCardRight()
            Handler(Looper.getMainLooper()).postDelayed({
                animate.animationBackCard()
                binding.TVtop.text = drawable2.fact

                if(imageTop2.answer == answerSwipe){
                    animate.animmateViewInvisible()
                        findNavController().navigate(R.id.action_gameFragment_to_vinFragment)


                }else{
                    ++points
                    binding.TVvin.text = "your win $points points!"

                }
                imageTop2 = drawable2
            }, 500L)


        }
    }
}
