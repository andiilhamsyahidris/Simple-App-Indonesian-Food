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

class CardViewFoodKalimantanAdapter(private val listDataKalimantan: ArrayList<DataKalimantanFood>) : RecyclerView.Adapter<CardViewFoodKalimantanAdapter.CardViewViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.cardviewkalimantan, parent, false)
        return CardViewViewHolder((view))
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val food = listDataKalimantan[position]

        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(220, 440))
            .into(holder.imgPhoto)

        holder.tvName.text = food.name
        holder.btn.setOnClickListener { view ->
            val moveKalimantanFoodRecipe = Intent(view.context, RecipeKalimantanFood::class.java)

            moveKalimantanFoodRecipe.putExtra(RecipeKalimantanFood.detailFood, food.detail)
            moveKalimantanFoodRecipe.putExtra(RecipeKalimantanFood.foodPhoto, food.photo)
            view.context.startActivity(moveKalimantanFoodRecipe)
        }

    }

    override fun getItemCount(): Int {
        return listDataKalimantan.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.imageKalimantanFood)
        var tvName: TextView = itemView.findViewById(R.id.nameKalimantanFood)
        var btn: Button = itemView.findViewById(R.id.btnFoodKalimantan)
    }
}