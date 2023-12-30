package com.example.kotlin_2023.collection

fun main(){

    val o1 = Ogrenciler(200,"zeynep","9c")
    val o2 = Ogrenciler(300,"ahmet","11z")
    val o3 = Ogrenciler(100,"beyza","12a")

    val ogrencilerListesi = ArrayList<Ogrenciler>()
    ogrencilerListesi.add(o1)
    ogrencilerListesi.add(o2)
    ogrencilerListesi.add(o3)

    for (o in ogrencilerListesi)
    {
        println("NO : ${o.no} - AD : ${o.ad} - SINIF : ${o.sinif}")
    }
    println("*************************")

    //Sıralama işlemi
    println("sayisal : Kücükten > Büyüge")
    val siralama1 = ogrencilerListesi.sortedWith(compareBy{it.no}) // nosuna gore buuykten kucuge
    for (o in siralama1)
        println("NO : ${o.no} - AD : ${o.ad} - SINIF : ${o.sinif}")

    println("sayisal : Büyükten > Kücüge")
    val siralama2 = ogrencilerListesi.sortedWith(compareByDescending{it.no})
    // nosuna gore buyukten kucuge
    for (o in siralama2)
        println("NO : ${o.no} - AD : ${o.ad} - SINIF : ${o.sinif}")

    println("metinsel : Kücükten > Büyüge")
    val siralama3 = ogrencilerListesi.sortedWith(compareBy{it.ad})
   //ad a göre alfabatik sıra
    for (o in siralama3)
        println("NO : ${o.no} - AD : ${o.ad} - SINIF : ${o.sinif}")

    println("metinsel : buyukten > kucuge")
    val siralama4 = ogrencilerListesi.sortedWith(compareByDescending{it.ad})
    //ad a göre ters alfabatik sıra
    for (o in siralama4)
        println("NO : ${o.no} - AD : ${o.ad} - SINIF : ${o.sinif}")

    // Filtreleme
        println("**********")
    println("Filtreleme 1 :")
    val filtreleme = ogrencilerListesi.filter { it.no>150 }
    for (o in filtreleme)
        println("NO : ${o.no} - AD : ${o.ad} - SINIF : ${o.sinif}")

    println("Filtreleme 2 :")
    val filtreleme2 = ogrencilerListesi.filter { it.ad.contains("yz") }
    // yz bütün olarak var ise olanları alırız
    for (o in filtreleme2)
        println("NO : ${o.no} - AD : ${o.ad} - SINIF : ${o.sinif}")



}