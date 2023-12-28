package com.example.kotlin_2023.nesne_tabanli_programlama.ders9_3

fun main(){

    ucretHesapla(123,KonserveBoyut.ORTA)
    // enum yazılımcıya kolaylık saglar
}

fun ucretHesapla(adet:Int,boyut: KonserveBoyut){

    when (boyut){
        KonserveBoyut.KUCUK -> println("Toplam Maliyet : ${adet*30}")
        KonserveBoyut.ORTA -> println("Toplam Maliyet : ${adet*40}")
        KonserveBoyut.BUYUK -> println("Toplam Maliyet : ${adet*50}")
    }


}
