package com.example.myapplication

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SumateraFood : AppCompatActivity() {

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<DataSumateraFood> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sumatera_food)

        // Custom Font
        val text: TextView = findViewById(R.id.textSumateraFood)
        val custom: Typeface = Typeface.createFromAsset(assets, "font/Love Story Rough.ttf")
        text.typeface = custom

        // Cardview
        rvFood = findViewById(R.id.cvFoodSumatera)
        rvFood.setHasFixedSize(true)
        list.addAll(SumatraFood.listDataSumatera)
        rvFood.layoutManager = LinearLayoutManager(this)
        val cardViewFoodAdapter = CardViewFoodSumateraAdapter(list)
        rvFood.adapter = cardViewFoodAdapter


    }
}
