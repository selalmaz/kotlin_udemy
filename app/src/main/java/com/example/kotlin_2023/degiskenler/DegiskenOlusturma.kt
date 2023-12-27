package com.example.kotlin_2023.degiskenler

fun main(){

    var ogrenci_adi = "ammo"
    var ogrenci_yas = 31
    var ogrenci_boy = 1.44
    var ogrenci_devamlilik = true

    println(ogrenci_adi)
    println(ogrenci_yas)
    println(ogrenci_boy)
    println(ogrenci_devamlilik)

    var urun_id : Int = 314
    var urun_adi : String = "maccbook"
    var urun_adet : Int = 31

    println(urun_adi)
    println(urun_adet)
    println(urun_id)

    var a = 10
    var b = 20
    println("$a x $b = ${a*b}")

    // sabitler - Constant

    var sayi =30
    println(sayi)
    sayi =100;
    println(sayi)

    // tür dönüşümü - type casting
    val i = 42
    val d = 78.94

    //sayisaldan sayisala dönüş
    val sonuc1= i.toDouble()
    val sonuc2= d.toInt()

    println(sonuc1)
    println(sonuc2)

    //sayisaldan metine dönüş

    val sonuc3 = i.toString()
    val sonuc4 = d.toString()
    println(sonuc3)
    println(sonuc4)
    //metinden sayısala dönüş
    val yazi = "57.41"
    val sonuc5 = yazi.toDoubleOrNull()
   // println(sonuc5)

    if (sonuc5 !=null)
    {
        println(sonuc5)
    }
    else{
        println("donusum hatasi")
    }

    // ifin daha pratik hali
    sonuc5?.let {
        println(it)
    }











}