package com.example.kotlin_2023.nesne_tabanli_programlama

fun main(){

    //nullable - nul safety
    var x = "merhaba"

    //tanımlama
    var str : String? = null

    str ="ammo"

    //kullanım

    //yöntem 1
    println("Yöntem 1 : ${str?.trim()}")
    // ? çalışma mantığı : sorun varsa ifade nullsa app çökmez
    // ama sonuc olarak null degeri verir

    //yöntem 2
   // println("Yöntem 2 : ${str!!.trim()}")
    // !!çalışma : mantığı ben bu ifadeye güveniyorum kesinlikle null olmayacak demek
    // ama null olursa app çökebilir


    //yöntem 3
    if (str != null)
    println("Yöntem 3 : ${str.trim()}")
    else
        println("sonuc nulldur")

    //yöntem 4
    str?.let {
        //str ifadesi null degılse calısır null ise calısmaz
        println("Yöntem 4 : ${str!!.trim()}")
    }

}