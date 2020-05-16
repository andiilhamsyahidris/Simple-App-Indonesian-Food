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

class CardViewFoodSulawesiAdapter(private val listDataSulawesi: ArrayList<DataSulawesiFood>): RecyclerView.Adapter<CardViewFoodSulawesiAdapter.CardViewViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder
    {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.cardviewsulawesi, parent, false)
        return CardViewViewHolder(view)
    }
    override fun getItemCount(): Int
    {
        return listDataSulawesi.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int)
    {
        val food = listDataSulawesi[position]

        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(220, 440))
            .into(holder.imgPhoto)

        holder.tvName.text = food.name
        holder.btn.setOnClickListener { view ->
            val moveRecipeSulawesiFood = Intent(view.context, RecipeSulawesiFood::class.java)

            moveRecipeSulawesiFood.putExtra(RecipeSulawesiFood.detailFood, food.detail)
            moveRecipeSulawesiFood.putExtra(RecipeSulawesiFood.foodPhoto, food.photo)
            view.context.startActivity(moveRecipeSulawesiFood)
        }
    }
    inner class CardViewViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        var imgPhoto: ImageView = itemView.findViewById(R.id.imageSulawesiFood)
        var tvName: TextView = itemView.findViewById(R.id.nameSulawesiFood)
        var btn: Button = itemView.findViewById(R.id.btnSulawesiFood)
    }
}