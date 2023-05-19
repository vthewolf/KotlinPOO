package com.example.kotlinpoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Si creo una clase nueva llamada Person, me creo un tipo de objeto. Por lo tanto
        ahora puedo crear objetos de ese tipo y acceder a sus atributos y métodos */
        val victor: Person = Person("Victor", "44431789K")
        // Creo este con los valores por defecto
        val anonimo: Person = Person()

        // Si pongo en el constructor de la clase unos parámetros, también puedo acceder a ellos
        println(victor.alive)
        println(victor.name)
        println(victor.passport)

        // Si llamo al constructor le asigno sus valores
        anonimo.Person()
        println(anonimo.alive)
        println(anonimo.name)
        println(anonimo.passport)

        victor.die()
        println(victor.alive)

        var pele: Athlete = Athlete("Pelé", "CD389104", "Futbol")
        println(pele.alive)
        println(pele.name)
        println(pele.passport)
        println(pele.sport)

        pele.die()
        println(pele.alive)

        var bicho: Pokemon = Pokemon()
        println(bicho.getName())
        println(bicho.getAttackPower())
        bicho.setLife(40f)
        println(bicho.getLife())



    }
}