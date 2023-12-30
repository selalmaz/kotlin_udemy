package com.example.kotlin_2023.ileri

fun main(){

    // 1.Compile error -> derleme hatasi
            val x =100
            //x = 200

    // 2.Exception -> uygulamyı cokerten hatalar
    val a = 10
    val b = 0
    //println("Sonuc : ${a/b}")

    try{
        println("Sonuc : ${a/b}")

    }catch (e:Exception){
        println(e)
    }


}
