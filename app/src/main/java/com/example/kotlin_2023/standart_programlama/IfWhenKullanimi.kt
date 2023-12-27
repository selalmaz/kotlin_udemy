package com.example.kotlin_2023.standart_programlama

fun main () {

    val yas = 10
    val isim ="ammo"

    if(yas >= 18)
            println("reşitsiniz")
    else{
        println("reşit degilsiniz")
    }

    if(isim == "ammo")
            println("merhaba $isim")
    else if (isim == "amo")
            println("merhaba amo")
    else{
        println("tanınmayan kisi")
    }

    val ka= "admin"
    val s = 12345

    if(ka == "admin" && s==12345)
        println("merhaba admin")
    else
        println("hatali giriss")

    // when :: switch

    val gun = 31

    when(gun){
        1-> println("pazartesi")
        2-> println("salı")
        3-> println("çarsamba")
        4-> println("persembe")
        5-> println("cuma")
        6-> println("cumaretsi")
        7-> println("pazar")
        else-> println("hatali gün girisi ")
    }








}