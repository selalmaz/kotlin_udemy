package com.example.kotlin_2023.nesne_tabanli_programlama

fun main (){

    val f = Fonksiyonlar()
    f.selamlar()
   val X= f.selamlar2("ammo13")
        println(X)
    val gelen_sonuc=f.toplama(5,15)
    println(gelen_sonuc)

    println(f.carp(15,2))
    println(f.carp(12,3.1))
    println(f.carp(1.5,2.4))



}