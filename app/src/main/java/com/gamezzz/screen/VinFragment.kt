package com.gamezzz.screen

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gamezzz.R
import com.gamezzz.databinding.FragmentVinBinding
import com.gamezzz.presenter.points



class VinFragment : Fragment() {

    val binding by lazy { FragmentVinBinding.inflate(layoutInflater) }
    var time = 0L
    var isVisibleA = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.TVvin.text = "$points points!"


        val animator1 = ObjectAnimator.ofFloat(binding.CVsceneWin, View.ALPHA, 1F)
        animator1.duration = 500
        animator1.start()

        repeat(100){
            Handler(Looper.getMainLooper()).postDelayed({
                if(isVisibleA){

                    val animator1 = ObjectAnimator.ofFloat(binding.TVtab, View.ALPHA, 1F)
                    animator1.duration = 1000L
                    animator1.start()
                    isVisibleA = false

                } else{

                    val animator1 = ObjectAnimator.ofFloat(binding.TVtab, View.ALPHA, 0F)
                    animator1.duration = 1000L
                    animator1.start()
                    isVisibleA = true
                }
            },time)
            time = time +1000L
        }




        binding.CVsceneWin.setOnClickListener{
            points = 0
            findNavController().navigate(R.id.action_vinFragment_to_gameFragment)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return binding.root
    }

}