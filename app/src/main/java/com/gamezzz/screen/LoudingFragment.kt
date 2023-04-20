package com.gamezzz.screen

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gamezzz.R
import com.gamezzz.databinding.FragmentLoudingBinding


class LoudingFragment : Fragment() {
val binding by lazy { FragmentLoudingBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //var time = 200L
        val animator1 = ObjectAnimator.ofFloat(binding.imageView, View.TRANSLATION_Y, -300F)
        animator1.duration = 0L
        animator1.start()

        val animator2 = ObjectAnimator.ofFloat(binding.imageView, View.ALPHA, 0F)
        animator2.duration = 0L
        animator2.start()

       // repeat(20) {
            val animator0 = ObjectAnimator.ofFloat(binding.imageView, View.ALPHA, 1F)
            animator0.duration = 2000L
            animator0.start()

        val animator3 = ObjectAnimator.ofFloat(binding.imageView, View.TRANSLATION_Y, 0F)
        animator3.duration = 1000L
        animator3.start()


        Handler().postDelayed({
            findNavController().navigate(R.id.action_loudingFragment_to_gameFragment)
        },3000L)

       // }

        return binding.root
    }



}