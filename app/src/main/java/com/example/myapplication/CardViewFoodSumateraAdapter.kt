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

class CardViewFoodSumateraAdapter(private val listDataSumatera: ArrayList<DataSumateraFood>) : RecyclerView.Adapter<CardViewFoodSumateraAdapter.CardViewViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder
    {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.cardviewsumatera, parent, false)
        return CardViewViewHolder((view))
    }
    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int)
    {
        val food = listDataSumatera[position]

        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(220, 440))
            .into(holder.imgPhoto)

        holder.tvName.text = food.name
        holder.btn.setOnClickListener { view ->
            val moveRecipeSumatraFood = Intent(view.context, RecipeSumateraFood::class.java)

            moveRecipeSumatraFood.putExtra(RecipeSumateraFood.foodPhoto, food.photo)
            moveRecipeSumatraFood.putExtra(RecipeSumateraFood.detailFood, food.detail)
            view.context.startActivity(moveRecipeSumatraFood)
        }
    }
    override fun getItemCount(): Int
    {
        return listDataSumatera.size
    }
    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var imgPhoto: ImageView = itemView.findViewById(R.id.imageSumateraFood)
        var tvName: TextView = itemView.findViewById(R.id.nameSumateraFood)
        var btn: Button = itemView.findViewById(R.id.btnFoodSumatera)
    }
}