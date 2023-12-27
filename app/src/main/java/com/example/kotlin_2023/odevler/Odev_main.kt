package com.example.kotlin_2023.odevler

fun main(){

    val nesne = Odev2()
    val cevap1=nesne.soru1(10)
    println("1.soru: "+cevap1)
    val cevap2=nesne.soru2(5,10)
    println("2.soru: "+cevap2)
    val cevap3 = nesne.soru3(6)
    println("3.soru: "+cevap3)
    val cevap4 = nesne.soru4("erik göt deler mi kie")
    println("4.soru: "+cevap4)
    val cevap5 = nesne.soru5(10)
    println("5.soru: $cevap5")
    val cevap6 = nesne.soru6(25)
    println("6.soru: $cevap6")
    val cevap7 = nesne.soru7(5)
    println("7.soru: $cevap7")



}