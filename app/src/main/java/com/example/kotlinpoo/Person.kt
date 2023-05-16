package com.example.kotlinpoo

class Person(var name: String = "Anonimo", var passport: String? = null) {
    var alive: Boolean = true

    /* Otra cosa que podemos hacer es crear un método que se llame igual que la clase
    y sería un método constructor. */

    fun Person(){
        name = "Juan"
        passport = "21413124"
    }

    fun die(){
        alive = false
    }



}
