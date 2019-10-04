package com.example.kotlinforintermediaries

import android.util.Log

class Bicycle constructor(speed:Int,gear:Int) {


    var speed : Int = 0
    var gear: Int =  0
    var wheels:Int=0

    constructor(speed: Int,gear: Int,wheels:Int): this(speed,gear){
        this.speed = speed
        this.gear= gear
        this.wheels =wheels
    }

    init {
        this.speed = speed
        this.gear =gear
    }

    fun speedUp(){
        Log.d("bicycle","speed")
    }

    fun changeGear(){
        Log.d("bicycle","gear")
    }
    fun wheels(){
        Log.d("bicycle","wheels")
    }
}
