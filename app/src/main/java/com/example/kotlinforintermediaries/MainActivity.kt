package com.example.kotlinforintermediaries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var teacher :Teacher = Teacher()
        var computerTeacher : ComputerTeacher = ComputerTeacher()

        var bicycle  = Bicycle(5,2)
        var bicycle1 =Bicycle(2,3,4)
        Log.d("MainActivity","properties"+bicycle1.speed+""+bicycle1.gear+""+bicycle1.wheels)
        bicycle1.changeGear()
        bicycle1.speedUp()
        bicycle1.wheels()
        //var array = arrayOf<String>()
        var  arrayList = ArrayList<String>()
        arrayList.add("one")

         var instance = Outer.Nested().function()
    }
}
