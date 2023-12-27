package com.example.kotlin_2023.nesne_tabanli_programlama

import kotlin.time.times

class Fonksiyonlar {

    // void geri dönğş tipi olmayan

    fun selamlar(){
        println("selam ammo")
    }

    // return geri dönüş değeri olan
    fun selamlar2(key:String):String{
        return  key
    }

    fun toplama(sayi1:Int,sayi2:Int): Int{
        return sayi1+sayi2
    }

    //overloading

    fun carp(sayi1:Int,sayi2:Int): Int {
        return sayi1*sayi2
    }
    fun carp(sayi1:Double,sayi2: Double):Double{
        return sayi1*sayi2
    }
    fun carp(sayi1:Int,sayi2: Double):Double{
        return  sayi1*sayi2
    }







}