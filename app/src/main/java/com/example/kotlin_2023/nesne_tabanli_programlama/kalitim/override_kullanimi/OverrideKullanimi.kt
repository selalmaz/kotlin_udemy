package com.example.kotlin_2023.nesne_tabanli_programlama.kalitim.override_kullanimi

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikart() //kalitim yok kendi sınıfına erişti
    memeli.sesCikart() // kalitim var üst sınıfın metodunu kullandı
    // Memeli sınıfında sesCikart adında metot yok olsaydı onu calıstırırdı
    // olmadıgı icin super classından aldı
    kedi.sesCikart() // kalitim var kendi sınıfının metodunu kullandı
    kopek.sesCikart() // kalitim var ken sınıfnın metodunu kullandı


}