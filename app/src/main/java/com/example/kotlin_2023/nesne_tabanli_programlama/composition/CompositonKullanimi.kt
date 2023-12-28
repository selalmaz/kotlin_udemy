package com.example.kotlin_2023.nesne_tabanli_programlama.composition

fun main(){

    /*veri tabanlarıyla çalışırken veri tabanı üzerindeki alt yapıları
    classlaştırmada güzel bir rehber oluyor */

    val k1= Kategoriler(1,"Dram")
    val k2= Kategoriler(2,"Bilim Kurgu")

    val y1 = Yonetmenler(1,"Tarantino")
    val y2 = Yonetmenler(2,"Nolan")

    val f1 = Filmler(1,"Django",2013,k1,y1)
    // yaptıgımız bu işlem composition oluyor,
    println("film id: "+f1.film_id)
    println("film ad: "+f1.film_ad)
    println("film yil: "+f1.film_yil)
    println("film kategori id: "+f1.kategori.kategori_id)
    println("film kategori ad: "+f1.kategori.kategori_ad)
    println("film yonetmen id: "+f1.yonetmen.yonetmen_id)
    println("film yonetmen id: "+f1.yonetmen.yonetmen_ad)


}