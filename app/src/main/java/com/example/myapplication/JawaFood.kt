package com.example.myapplication

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class JawaFood : AppCompatActivity() {

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<DataJawaFood> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jawa_food)

        // Custom Font
        val text: TextView = findViewById(R.id.textJawaFood)
        val custom: Typeface = Typeface.createFromAsset(assets, "font/Love Story Rough.ttf")
        text.typeface = custom

        // CardView
        rvFood = findViewById(R.id.cvFoodJawa)
        rvFood.setHasFixedSize(true)
        list.addAll(JawwaFood.listDataJawa)
        rvFood.layoutManager = LinearLayoutManager(this)
        val cardViewFoodAdapter = CardViewFoodJawaAdapter(list)
        rvFood.adapter = cardViewFoodAdapter

    }
}
