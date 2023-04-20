package com.gamezzz.presenter


import android.animation.ObjectAnimator
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.gamezzz.R

class AnimationCards() {
   private lateinit var cardBack:View
    private  lateinit var cardFront:View
    private lateinit var cardStart:View
    private lateinit var cardFinish:View

    private lateinit var textViewTimer:View
    private lateinit var buttonPlay:View
    private lateinit var imageViewTimer:View
    private lateinit var imageViewSec:View
    private lateinit var gameScene:View
    private lateinit var finger:View
    private lateinit var textTrue:View
    private lateinit var textFalse:View
    var clickTimer = true
    var firstClick = true




    var second = 60
    var  secondAfther = 1000L



    fun init(
        cardBack:View ,
        cardFront:View,
        cardStart:View,
        carsFinish:View,

        tvTimer:View ,
        bPlay:View,
        ivTemer:View,
        ivSec:View,
        gameScene:View,
        finger:View,
        textTrue:View,
        textFalse:View

    ){
        this.cardBack = cardBack
        this.cardFront = cardFront
        this.cardStart = cardStart
        this.cardFinish = carsFinish

        textViewTimer = tvTimer

        buttonPlay = bPlay
        imageViewSec = ivSec
        imageViewTimer = ivTemer
        this.gameScene = gameScene
        this.finger = finger
        this.textTrue  = textTrue
        this.textFalse = textFalse

    }

    fun startInstructioAnimation(){

        val animator23 = ObjectAnimator.ofFloat(buttonPlay,View.ALPHA , 0F)
        animator23.duration = 500
        animator23.start()

        Handler(Looper.getMainLooper()).postDelayed({
            val animator23 = ObjectAnimator.ofFloat(textTrue,View.ALPHA , 1F)
            animator23.duration = 500
            animator23.start()
        },500L)

        Handler(Looper.getMainLooper()).postDelayed({
            val animator23 = ObjectAnimator.ofFloat(textFalse,View.ALPHA , 1F)
            animator23.duration = 500
            animator23.start()
            Handler(Looper.getMainLooper()).postDelayed({
                val animator232 = ObjectAnimator.ofFloat(textTrue,View.ALPHA , 0F)
                animator232.duration = 500
                animator232.start()

                val animator23 = ObjectAnimator.ofFloat(textFalse,View.ALPHA , 0F)
                animator23.duration = 500
                animator23.start()
            },1000L)
        },1700L)




        Handler(Looper.getMainLooper()).postDelayed({
            val animator23 = ObjectAnimator.ofFloat(finger,View.ALPHA , 1F)
            animator23.duration = 400
            animator23.start()

        val animator1 = ObjectAnimator.ofFloat(finger,View.X , 0F)
        animator1.duration = 750
        animator1.start()
        Handler(Looper.getMainLooper()).postDelayed({

            val animator1 = ObjectAnimator.ofFloat(finger,View.ALPHA , 0F)
            animator1.duration = 200

            animator1.start() },750L)

        Handler(Looper.getMainLooper()).postDelayed({
            val animator1 = ObjectAnimator.ofFloat(finger,View.ALPHA , 1F)
            animator1.duration = 400
            animator1.start()
            Handler(Looper.getMainLooper()).postDelayed({
            val animator2 = ObjectAnimator.ofFloat(finger,View.X ,( gameScene.width-finger.width).toFloat())
            animator2.duration = 750

                Handler(Looper.getMainLooper()).postDelayed({
                    val animator1 = ObjectAnimator.ofFloat(finger,View.ALPHA , 0F)
                    animator1.duration = 200
                    animator1.start() },750L)


                animator2.start()},200L)
        },1200L)
        },200L)

        }



    fun animationStartCard(){

            val animator1 = ObjectAnimator.ofFloat(cardStart, View.TRANSLATION_Y, -600F)
            animator1.duration = 1000
            animator1.start()

            val animator2 = ObjectAnimator.ofFloat(cardStart, View.ALPHA, 0F)
            animator2.duration = 1000
            animator2.start()
    }

    fun animationFrontCardLeft(){
        val animator1 = ObjectAnimator.ofFloat(cardFront, View.TRANSLATION_Y, -600F)
        animator1.duration = 500
        animator1.start()

        val animator2 = ObjectAnimator.ofFloat(cardFront, View.ALPHA, 0F)
        animator2.duration = 500
        animator2.start()

        val animator3 = ObjectAnimator.ofFloat(cardFront, View.ROTATION, -50F)
        animator3.duration = 500
        animator3.start()

        val animator4 = ObjectAnimator.ofFloat(cardFront, View.TRANSLATION_Y, -600F)
        animator4.duration = 500
        animator4.start()

        val animator5 = ObjectAnimator.ofFloat(cardFront, View.TRANSLATION_X, -600F)
        animator5.duration = 500
        animator5.start()

        Handler().postDelayed({
        val animator6 = ObjectAnimator.ofFloat(cardFront, View.TRANSLATION_Y, -0F)
        animator6.duration = 0
        animator6.start()

        val animator7 = ObjectAnimator.ofFloat(cardFront, View.ALPHA, 1F)
        animator7.duration = 0
        animator7.start()

        val animator8 = ObjectAnimator.ofFloat(cardFront, View.ROTATION, 0F)
        animator8.duration = 0
        animator8.start()

        val animator9 = ObjectAnimator.ofFloat(cardFront, View.TRANSLATION_Y, 0F)
        animator9.duration = 0
        animator9.start()

        val animator10 = ObjectAnimator.ofFloat(cardFront, View.TRANSLATION_X, 0F)
        animator10.duration = 0
        animator10.start()
        },500L)
    }

    fun animationFrontCardRight(){
        val animator1 = ObjectAnimator.ofFloat(cardFront, View.TRANSLATION_Y, -600F)
        animator1.duration = 500
        animator1.start()

        val animator2 = ObjectAnimator.ofFloat(cardFront, View.ALPHA, 0F)
        animator2.duration = 500
        animator2.start()

        val animator3 = ObjectAnimator.ofFloat(cardFront, View.ROTATION, 50F)
        animator3.duration = 500
        animator3.start()

        val animator4 = ObjectAnimator.ofFloat(cardFront, View.TRANSLATION_Y, -600F)
        animator4.duration = 500
        animator4.start()

        val animator5 = ObjectAnimator.ofFloat(cardFront, View.TRANSLATION_X, 600F)
        animator5.duration = 500
        animator5.start()

        Handler().postDelayed({
            val animator6 = ObjectAnimator.ofFloat(cardFront, View.TRANSLATION_Y, -0F)
            animator6.duration = 0
            animator6.start()

            val animator7 = ObjectAnimator.ofFloat(cardFront, View.ALPHA, 1F)
            animator7.duration = 0
            animator7.start()

            val animator8 = ObjectAnimator.ofFloat(cardFront, View.ROTATION, 0F)
            animator8.duration = 0
            animator8.start()

            val animator9 = ObjectAnimator.ofFloat(cardFront, View.TRANSLATION_Y, 0F)
            animator9.duration = 0
            animator9.start()

            val animator10 = ObjectAnimator.ofFloat(cardFront, View.TRANSLATION_X, 0F)
            animator10.duration = 0
            animator10.start()
        },500L)
    }

    fun animationBackCard(){
        val animator6 = ObjectAnimator.ofFloat(cardBack, View.SCALE_X, 0.8F)
        animator6.duration = 0
        animator6.start()

        val animator7 = ObjectAnimator.ofFloat(cardBack, View.SCALE_Y, 0.8F)
        animator7.duration = 0
        animator7.start()

        val animator8 = ObjectAnimator.ofFloat(cardBack, View.SCALE_X, 1F)
        animator8.duration = 250
        animator8.start()

        val animator9 = ObjectAnimator.ofFloat(cardBack, View.SCALE_Y, 1F)
        animator9.duration = 250
        animator9.start()
    }

    fun startTimer(){
        buttonPlay.isClickable = false
        val animator1 = ObjectAnimator.ofFloat(cardFinish, View.TRANSLATION_Y, -600F)
        animator1.duration = 300
        animator1.start()

        val animator2 = ObjectAnimator.ofFloat(cardFinish, View.ALPHA, 0F)
        animator2.duration = 300
        animator2.start()
       // cardFinish.alpha = 0F
        second = 60
        secondAfther = 1000L

        Handler().postDelayed({
       // buttonPlay.isVisible = false
        },500)

        for(it in 0..59){


            Handler().postDelayed({
                second = second-1
                (textViewTimer as TextView).text = second.toString()

                if(it==59) {
                    clickTimer = true
                   animationFinishCard()
                }
            },secondAfther)
            secondAfther = secondAfther+1000L
        }
    }



    fun animationFinishCard(){

        //clickTimer = true
        firstClick = true
        val animator1 = ObjectAnimator.ofFloat(cardFinish, View.TRANSLATION_Y, 0F)
        animator1.duration = 1000
        animator1.start()

        val animator2 = ObjectAnimator.ofFloat(cardFinish, View.ALPHA, 1F)
        animator2.duration = 1000
        animator2.start()

        val animator0 = ObjectAnimator.ofFloat(buttonPlay, View.ALPHA, 0F)
        animator0.duration = 300
        animator0.start()


//        (buttonPlay as ImageView).setImageResource(R.drawable.reload)
        val animator7 = ObjectAnimator.ofFloat(buttonPlay, View.ALPHA, 1F)
        animator7.duration = 300
        animator7.start()
        //  buttonPlay.isVisible = true
        buttonPlay.isClickable = true
    }

    fun animationWinCard(){

        val animator0 = ObjectAnimator.ofFloat(buttonPlay, View.ALPHA, 0F)
        animator0.duration = 300
        animator0.start()



    }

    fun animmateViewInvisible(){



        val animator3 = ObjectAnimator.ofFloat(cardFront, View.ALPHA, 0F)
        animator3.duration = 500
        animator3.start()

        val animator4 = ObjectAnimator.ofFloat(cardBack, View.ALPHA, 0F)
        animator4.duration = 500
        animator4.start()

        val animator5 = ObjectAnimator.ofFloat(cardFinish, View.ALPHA, 0F)
        animator5.duration = 500
        animator5.start()

        val animator6 = ObjectAnimator.ofFloat(textViewTimer, View.ALPHA, 0F)
        animator6.duration = 500
        animator6.start()

        val animator7 = ObjectAnimator.ofFloat(imageViewTimer, View.ALPHA, 0F)
        animator7.duration = 500
        animator7.start()

        val animator8 = ObjectAnimator.ofFloat(imageViewSec, View.ALPHA, 0F)
        animator8.duration = 500
        animator8.start()
    }

}