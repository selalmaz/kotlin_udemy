package com.example.kotlin_2023.standart_programlama

fun main (){

    // 1,2,3

    for (i in 1..3)
        println("Döngü1 : $i")

    // 10 ile 20 arasında 5 erli artıcak

    for(i in 10..20 step 5){
        println("Döngü2 : $i")
    }

    //20 ile 10 arasında 5 azalan

    for(i in 20 downTo 10 step 5)
        println("Döngü3 $i")

    //1,2,3,4,5
    var sayac = 1

    while(sayac<6){
        println("Döngü4 $sayac")
        sayac++
    }

    for (i in 1..5)
    {
        if (i==3){
            break
        }
        println("Döngü5 $i")
    }

    for (i in 1..5)
    {
        if (i==3)
            continue
        println("Döngü6 $i")
    }








}