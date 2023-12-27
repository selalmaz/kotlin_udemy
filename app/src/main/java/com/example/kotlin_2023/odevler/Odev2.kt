package com.example.kotlin_2023.odevler

class Odev2 {

    fun soru1(km:Int): Double{
        val mile = km*0.621
        return mile
    }
    fun soru2(kisaKenar : Int,uzunKenar:Int): Int{
        val alan = kisaKenar*uzunKenar
        return alan
    }
    fun soru3(sayi:Int):Int{
        var fak = 1
        for(i in 1..sayi)
            fak=fak*i
        return fak
    }

    fun soru4(kelime:String):Int{
        var sayac =0
        for(i in 0..kelime.length-1){
            if(kelime[i]=='e')
                sayac++
        }
        return sayac
    }

    fun soru5(kenarSayisi:Int) : Int{
        val sonuc = ((kenarSayisi-2)*180)/kenarSayisi
        return sonuc
    }

    fun soru6(gunSayisi: Int): Double{

        val calismaSaati = 8
        val calismaSaatUcreti = 40.0
        val mesaiSaatUcreti = 80.0
        val mesaiSiniri = 150

        val toplamCalismaSaati = gunSayisi * calismaSaati

        val temelMaas = toplamCalismaSaati * calismaSaatUcreti

        val mesaiSaatleri = if (toplamCalismaSaati > mesaiSiniri) {
            toplamCalismaSaati - mesaiSiniri
        } else {
            0
        }

        val mesaiMaasi = mesaiSaatleri * mesaiSaatUcreti

        val toplamMaas = temelMaas + mesaiMaasi

        return toplamMaas
    }


    fun soru7(saat:Int):Int{

        var sonuc=0

        if(saat==1)
            sonuc = 50
        else if(saat>=2){
            sonuc = 50+(saat-1)*10
        }
        else{
            sonuc = -1
        }

        return sonuc
    }








}