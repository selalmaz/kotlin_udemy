package com.example.kotlin_2023.nesne_tabanli_programlama

fun main(){

    val sonuc =5.carpi(2)
    println("gelen sonuc: "+sonuc)
    val sonuc2 = 10 toplam 4
    println("gelen sonuc: $sonuc2")

}


fun Int.carpi(sayi:Int):Int{
    return this * sayi // this = int sınıfı
}
infix  fun Int.toplam(sayi:Int) : Int{  //infix eklersek key olur sadece
    return  this+sayi
}