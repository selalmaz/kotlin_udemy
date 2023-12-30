package com.example.kotlin_2023.nesne_tabanli_programlama.interface_kullanimi

class ClassA : MyInterface {
    override val degisken: Int =10


    override fun metod() {
       println("metot 1 calisti")
    }

    override fun metod2(): String {
        return "metod 2 çalıştı"
    }
}