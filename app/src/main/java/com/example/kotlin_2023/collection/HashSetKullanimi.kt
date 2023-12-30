package com.example.kotlin_2023.collection

fun main () {

  // karısık ekler
    val meyveler = HashSet<String>()

    meyveler.add("elma")
    meyveler.add("kiraz")
    meyveler.add("muz")
    println(meyveler)
    meyveler.add("elma") // elma daha onceden oludugu ıcın icerige eklenmez
    println(meyveler)

    println(meyveler.elementAt(1)) // 1.ındexdeki degeri alır
    println(meyveler.size)
    println(meyveler.isEmpty())

    for (m in meyveler)
        println("Sonuc : $m")

    meyveler.remove("Elma") // elmayi siler
    println(meyveler)
    meyveler.clear()
    println(meyveler)



}




