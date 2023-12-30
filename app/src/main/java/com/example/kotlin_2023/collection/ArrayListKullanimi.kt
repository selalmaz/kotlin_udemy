package com.example.kotlin_2023.collection

fun main(){
    // tanımlama
    val sayilar =ArrayList<Int>()
    val meyveler = ArrayList<String>()
    meyveler.add("Elma") //0.index
    meyveler.add("muz") //1.index
    meyveler.add("kiraz")//2.index
    println(meyveler)

    //güncelleme
    meyveler[1] = "Yeni muz"
    println(meyveler)

    //insert araya ekleme
    meyveler.add(1,"portakal") //1.indexe portakal ekler ve diger indexleri kaydırır
    println(meyveler)

    //okuma işlemi
    println(meyveler[3])
    println(meyveler.get(2))

    println("Boyut : ${meyveler.size}")
    println("Boyut : ${meyveler.count()}")
    println("Boş Kontrol : ${meyveler.isEmpty()}")
    println("İceriyor mu : ${meyveler.contains("kiraz")}")

    meyveler.reverse() //içerigi ters cevirir
    println(meyveler)

    meyveler.sort() // alfabatik sıralar
    println(meyveler)

    for(meyve in meyveler)
    {
        println("Sonuc : $meyve")
    }
    for ((indeks,meyve) in meyveler.withIndex())
    {
        println("$indeks -> $meyve")
    }

    meyveler.removeAt(2) // 2. indexdeki degeri siler
    println(meyveler)

    meyveler.clear() // komple siler
    println(meyveler)











}