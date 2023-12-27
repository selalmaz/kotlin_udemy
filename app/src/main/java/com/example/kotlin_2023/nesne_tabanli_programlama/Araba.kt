package com.example.kotlin_2023.nesne_tabanli_programlama

class Araba(var renk: String,var hiz:Int,var calisiyor_mu:Boolean){
    //this veya self : bulundugunuz sınıfı temsil eder
    //super : Kalitim varsa üst sınıfı temsil eder

    //constructor,init başlatıcı fonksiyonlardır
    // bir clasttan nesne olustrudugnuz anda ılk calısan yapilardir

    init{
        println("**********Constuctor çalıştı.**********")
        //bu constructortur her nesne olusturdugumzda burası ilk calısır
    }










    fun calistir()
    {
        calisiyor_mu=true
        hiz+=10
    }

    fun durdur()
    {
        calisiyor_mu=false
        hiz=0
    }

    fun hizlan(kac_km:Int)
    {
        hiz+=kac_km
    }
    fun yavasla(kac_km:Int)
    {
        hiz-=kac_km
    }



    fun bilgileri_al(){
        println("---------------------")
        println("Renk: $renk")
        println("hiz : $hiz")
        println("çalışıyor mu : $calisiyor_mu")
    }



}