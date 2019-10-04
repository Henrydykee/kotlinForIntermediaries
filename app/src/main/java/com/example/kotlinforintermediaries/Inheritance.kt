package com.example.kotlinforintermediaries

import android.util.Log

 open class  Teacher {
    var salary: Int = 0
    var name: String? = null
    var familyName: String? = null

    fun teach() {
        Log.d("inheritance", "teach")
    }

    fun understanding() {
        Log.d("inheritance", "understanding")
    }
}
class ComputerTeacher : Teacher() {
    var bonus: Int = 0

    fun getBonus(){
        Log.d("inheritance", "getBonus")
    }
}