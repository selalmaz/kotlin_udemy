package com.example.kotlin_2023.collection

fun main (){

    // key value
    val iller = HashMap<Int,String>()

    iller.put(16,"bursa")
    iller.put(34,"istanbul")

    iller[6] = "Ankara"
    println(iller)

    //okuma işlemi
    println(iller.get(16))

    // güncelleme
    iller.put(16,"yeni bursa")
    println(iller)
    println(iller.size)
    println(iller.isEmpty())

    for ((anahtar,deger) in iller)
    {
        println("$anahtar -> $deger")
    }
    iller.remove(34)
    println(iller)

    iller.clear()
    println(iller)





}