package com.example.myapplication

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PapuaFood : AppCompatActivity() {

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<DataPapuaFood> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_papua_food)

        // Custom Font
        val text:TextView = findViewById(R.id.textPapuaFood)
        val custom:Typeface = Typeface.createFromAsset(assets, "font/Love Story Rough.ttf")
        text.typeface = custom

        // CardView
        rvFood = findViewById(R.id.cvFoodPapua)
        rvFood.setHasFixedSize(true)
        list.addAll(PpuaFood.listDataPapua)
        rvFood.layoutManager = LinearLayoutManager(this)
        val cardViewFoodAdapter = CardViewFoodPapuaAdapter(list)
        rvFood.adapter = cardViewFoodAdapter
    }
}
