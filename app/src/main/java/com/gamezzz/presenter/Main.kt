package com.gamezzz.presenter



    ///////////////// Конструкция if else ///////////////////
    fun main(){
    val a = 10
    if(a == 9) println("a = 10")
    else if(a == 8) println("a = 20")
    else println("неопределенное значение")


        ///////////////// Конструкция When{}///////////////////

        val b= 10
        when(b){
            9,10,11 -> {println("a = 10")
                println("a = 10")
        }
            8 -> println("a = 20")
            in 21..60 -> println("мололодой")
            else -> println("неопределенное значение")
        }

}