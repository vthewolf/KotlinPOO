package com.example.kotlinpoo

open class Person(var name: String = "Anonimo", var passport: String? = null) {
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

class Athlete(name: String, passport: String?, var sport: String): Person(name, passport){
    /*
    * Una clase hereda de otra t0d0 lo que tiene, tanto atributos como métodos
    * Aunque se puede hacer que algunas cosas no se hereden.
    */
}
