package com.example.kotlin_2023.nesne_tabanli_programlama

fun main(){

    // nesne olusturma
    val araba1 = Araba("kırmızı",100,false)
    val araba2 = Araba("mavi",55,true)
    println(araba2.hiz)
    println(araba1.renk)


    // veri atama
    println("----------------------------")
    araba1.renk="bordo"
    println(araba1.renk)
    araba1.bilgileri_al()
    araba2.bilgileri_al()

    araba1.durdur()
    araba1.bilgileri_al()
    araba1.calistir()
    araba1.bilgileri_al()
    val araba3=Araba("sarı",45,true)
    araba3.bilgileri_al()





}