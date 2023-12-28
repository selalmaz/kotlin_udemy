package com.example.kotlin_2023.nesne_tabanli_programlama.composition

data class Filmler(var film_id:Int,
                   var film_ad:String,
                   var film_yil:Int,
                   var kategori:Kategoriler,
                   var yonetmen:Yonetmenler) {
}