package com.example.myapplication

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SulawesiFood : AppCompatActivity() {

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<DataSulawesiFood> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sulawesi_food)

        // Custom Font
        val text:TextView = findViewById(R.id.textSulawesiFood)
        val custom: Typeface = Typeface.createFromAsset(assets, "font/Love Story Rough.ttf")
        text.typeface = custom

        // CardView
        rvFood = findViewById(R.id.cvFoodSulawesi)
        rvFood.setHasFixedSize(true)
        list.addAll(SulwesiFood.listDataSulawesi)
        rvFood.layoutManager = LinearLayoutManager(this)
        val cardViewFoodAdapter = CardViewFoodSulawesiAdapter(list)
        rvFood.adapter = cardViewFoodAdapter

    }
}
