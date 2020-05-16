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

class CardViewFoodPapuaAdapter(private val listDataPapua: ArrayList<DataPapuaFood>): RecyclerView.Adapter<CardViewFoodPapuaAdapter.CardViewViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder
    {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.cardviewpapua, parent, false)
        return CardViewViewHolder(view)
    }
    override fun getItemCount(): Int
    {
        return listDataPapua.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int)
    {
        val food = listDataPapua[position]

        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(220, 440))
            .into(holder.imgPhoto)

        holder.tvName.text = food.name
        holder.btn.setOnClickListener { view ->
            val moveSulawesiFoodRecipe = Intent(view.context, RecipePapuaFood::class.java)

            moveSulawesiFoodRecipe.putExtra(RecipePapuaFood.detailFood, food.detail)
            moveSulawesiFoodRecipe.putExtra(RecipePapuaFood.foodPhoto, food.photo)
            view.context.startActivity(moveSulawesiFoodRecipe)
        }
    }
    inner class CardViewViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        var imgPhoto: ImageView = itemView.findViewById(R.id.imagePapuaFood)
        var tvName: TextView = itemView.findViewById(R.id.namePapuaFood)
        var btn: Button = itemView.findViewById(R.id.btnPapuaFood)
    }
}