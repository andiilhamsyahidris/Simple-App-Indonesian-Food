package com.example.myapplication

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class RecipeSulawesiFood : AppCompatActivity() {

    companion object
    {
        const val detailFood = "detail_food"
        const val foodPhoto = "food_photo"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_sulawesi_food)

        val foodPhoto = intent.getIntExtra(foodPhoto, 0)
        val layoutFoodPhoto: ImageView = findViewById(R.id.imageRecipeSulawesiFood)
        Glide.with(this)
            .load(foodPhoto)
            .apply(RequestOptions().override(220, 440))
            .into(layoutFoodPhoto)
        val detailFood = intent.getStringExtra(detailFood)
        val layoutDetailFood: TextView = findViewById(R.id.detailSulawesiFood)
        layoutDetailFood.text = detailFood

        // Custom font
        val customm: Typeface = Typeface.createFromAsset(assets, "font/Bray Notes.ttf")
        layoutDetailFood.typeface = customm
    }
}
