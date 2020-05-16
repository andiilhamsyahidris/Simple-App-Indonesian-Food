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

class CardViewFoodJawaAdapter(private val listDataJawa: ArrayList<DataJawaFood>): RecyclerView.Adapter<CardViewFoodJawaAdapter.CardViewViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder
    {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.cardviewjawa, parent, false)
        return CardViewViewHolder(view)
    }
    override fun getItemCount(): Int
    {
        return listDataJawa.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int)
    {
        val food = listDataJawa[position]

        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(220, 440))
            .into(holder.imgPhoto)

        holder.tvName.text = food.name
        holder.btn.setOnClickListener {view ->
            val moveJawaFoodRecipe = Intent(view.context, RecipeJawaFood::class.java)

            moveJawaFoodRecipe.putExtra(RecipeJawaFood.detailFood, food.detail)
            moveJawaFoodRecipe.putExtra(RecipeJawaFood.foodPhoto, food.photo)
            view.context.startActivity(moveJawaFoodRecipe)
        }
    }
    inner class CardViewViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        var imgPhoto: ImageView = itemView.findViewById(R.id.imageJawaFood)
        var tvName: TextView = itemView.findViewById(R.id.nameJawaFood)
        var btn: Button = itemView.findViewById(R.id.btnJawaFood)
    }
}