package com.example.kotlin_2023.nesne_tabanli_programlama.kalitim.override_kullanimi

class Kopek :Memeli(){

    override fun sesCikart() {
     //   super.sesCikart() // super->Üst sınıfı temsil eder(Hayvan)
        // this-> bulundugu sınıfı temsil eder(Memeli)
        println("hav hav")
    }
}