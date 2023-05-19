package com.example.kotlinpoo

import android.widget.Toast
import com.example.kotlinpoo.MainActivity.Companion.maincontext

open class Pokemon(
    protected var name: String = "Pok",
    protected var attackPower: Float = 30f,
    protected var life: Float = 100f
) {

    fun Pokemon(n: String, aP: Float) {
        this.name = n
        this.attackPower = aP
        this.life = 100f
        this.sayHi()
    }
/*
* Se pone internal cuando ponemos protected
*/
    internal fun getName(): String { return this.name }
    internal fun getAttackPower(): Float{ return this.attackPower }
    internal fun getLife(): Float { return this.life }
    internal fun setLife(l: Float) { this.life = l}

    fun cure() { this.life = 100f }

    fun evolve(n: String){
        this.name = n
        this.attackPower *= 1.20f
        this.sayHi()
    }

    fun sayHi() { Toast.makeText(maincontext, "Hola, soy $name", Toast.LENGTH_LONG).show() }
    fun attack() { Toast.makeText(maincontext, "Al ataqueeeee", Toast.LENGTH_LONG).show() }
    class Waterpokemon(n: String = "Pok", aP: Float = 30f, l: Float = 100f) : Pokemon(n, aP, l){

        private var maxResistance: Int = 500
        private var submergedTime: Int = 0

        fun Waterpokemon(n: String, aP: Float, mR: Int){
            this.name = n
            this.attackPower = aP
            this.life = 100f
            this.maxResistance = mR
        }
        fun breathe() { this.submergedTime = 0}
        fun immerse() { this.submergedTime++}
    }

}