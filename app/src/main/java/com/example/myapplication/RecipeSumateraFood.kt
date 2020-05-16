package com.example.myapplication

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class RecipeSumateraFood : AppCompatActivity() {

    companion object
    {
        const val foodPhoto = "food_photo"
        const val detailFood = "detail_food"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_sumatera_food)

        val foodPhoto = intent.getIntExtra(foodPhoto, 0)
        val layoutFoodPhoto: ImageView = findViewById(R.id.imageRecipeSumateraFood1)
        Glide.with(this)
            .load(foodPhoto)
            .apply(RequestOptions().override(220, 440))
            .into(layoutFoodPhoto)
        val detailFood = intent.getStringExtra(detailFood)
        val layoutDetailFood: TextView = findViewById(R.id.detailSumateraFood)
        layoutDetailFood.text = detailFood

        // Custom Font
        val customm: Typeface = Typeface.createFromAsset(assets, "font/Bray Notes.ttf")
        layoutDetailFood.typeface = customm
    }
}
