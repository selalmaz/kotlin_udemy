package com.example.kotlin_2023.nesne_tabanli_programlama.kalitim

fun main () {

    val topkapiSarayi = Saray(5,300)
    val bogazVilla = Villa(true,10)

    println(topkapiSarayi.KuleSayisi)
    println(topkapiSarayi.pencereSayisi)
    println(bogazVilla.garajVarmi)
    println(bogazVilla.pencereSayisi)

    if(topkapiSarayi is Saray)
        println("saraydir")
    else
        println("saray değildir")

    //Upcasting(subclassi super classa dönüştürme)
      //  val ev:Ev = bogazVilla

    //Downcasting(super classi subclassa dönüştürme)
        //val ev1 = Ev(12)
       // val saray = ev1 as Saray
    // şuan hata alıyor yapı uygun değil






}