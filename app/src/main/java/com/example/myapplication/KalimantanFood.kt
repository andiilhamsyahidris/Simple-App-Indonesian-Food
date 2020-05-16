package com.example.myapplication

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KalimantanFood : AppCompatActivity() {

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<DataKalimantanFood> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalimantan_food)

        // Custom Font
        val text: TextView = findViewById(R.id.textKalimantanFood)
        val custom: Typeface = Typeface.createFromAsset(assets, "font/Love Story Rough.ttf")
        text.typeface = custom

        // CardView
        rvFood = findViewById(R.id.cvFoodKalimantan)
        rvFood.setHasFixedSize(true)
        list.addAll(KalimntanFood.listDataKalimantan)
        rvFood.layoutManager = LinearLayoutManager(this)
        val cardViewFoodAdapter = CardViewFoodKalimantanAdapter(list)
        rvFood.adapter = cardViewFoodAdapter
    }
}
