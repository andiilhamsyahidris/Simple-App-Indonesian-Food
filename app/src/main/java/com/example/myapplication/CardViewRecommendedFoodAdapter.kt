package com.example.myapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewRecommendedFoodAdapter(private val listDataRecommendedFood: ArrayList<DataRecommendedFood>): RecyclerView.Adapter<CardViewRecommendedFoodAdapter.CardViewViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder
    {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.cardviewrecommendedfood, parent, false)
        return CardViewViewHolder(view)
    }
    override fun getItemCount(): Int
    {
        return listDataRecommendedFood.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int)
    {
        val food = listDataRecommendedFood[position]

        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(220, 440))
            .into(holder.imgPhoto)

        holder.tvName.text = food.name
        holder.btn.setOnClickListener { view ->
            val moveRecipeRecomendFood = Intent(view.context, RecipeRecommendedFood::class.java)

            moveRecipeRecomendFood.putExtra(RecipeRecommendedFood.detailFood, food.detailFood)
            moveRecipeRecomendFood.putExtra(RecipeRecommendedFood.foodPhoto, food.photo)
            view.context.startActivity(moveRecipeRecomendFood)
        }
    }
    inner class CardViewViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        var imgPhoto: ImageView = itemView.findViewById(R.id.imageRecommendedFood)
        var tvName: TextView = itemView.findViewById(R.id.nameRecommendedFood)
        var btn: Button = itemView.findViewById(R.id.btnRecommendFood)
    }
}