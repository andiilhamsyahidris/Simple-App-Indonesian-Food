package com.example.myapplication

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<DataRecommendedFood> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Custom Font
        val text: TextView = findViewById(R.id.textRecommendedFood)
        val custom: Typeface = Typeface.createFromAsset(assets, "font/Love Story Rough.ttf")
        text.typeface = custom

        // CardView
        rvFood = findViewById(R.id.cvRecommendedFood)
        rvFood.setHasFixedSize(true)
        list.addAll(RecommendedFood.listDataRecommended)
        rvFood.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val cardViewFoodAdapter = CardViewRecommendedFoodAdapter(list)
        rvFood.adapter = cardViewFoodAdapter

        // Activity
        val sumatera: ImageButton = findViewById(R.id.btnSumatera)
        val jawa: ImageButton = findViewById(R.id.btnJawa)
        val kalimantan: ImageButton = findViewById(R.id.btnKalimantan)
        val sulawesi: ImageButton = findViewById(R.id.btnSulawesi)
        val papua: ImageButton = findViewById(R.id.btnPapua)
        val about: ImageButton = findViewById(R.id.btnAboutMe)
        sumatera.setOnClickListener(this)
        jawa.setOnClickListener(this)
        kalimantan.setOnClickListener(this)
        sulawesi.setOnClickListener(this)
        papua.setOnClickListener(this)
        about.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id )
        {
            R.id.btnSumatera -> {
                val moveSumatera = Intent(this@MainActivity, SumateraFood::class.java)
                startActivity(moveSumatera)
            }
            R.id.btnJawa -> {
                val moveJawa = Intent(this@MainActivity, JawaFood::class.java)
                startActivity(moveJawa)
            }
            R.id.btnKalimantan -> {
                val moveKalimantan = Intent(this@MainActivity, KalimantanFood::class.java)
                startActivity(moveKalimantan)
            }
            R.id.btnSulawesi -> {
                val moveSulawesi = Intent(this@MainActivity, SulawesiFood::class.java)
                startActivity(moveSulawesi)
            }
            R.id.btnPapua -> {
                val movePapua = Intent(this@MainActivity, PapuaFood::class.java)
                startActivity(movePapua)
            }
            R.id.btnAboutMe -> {
                val moveAboutMe = Intent(this@MainActivity, AboutMe::class.java)
                moveAboutMe.putExtra(AboutMe.myName, "Andi Ilhamsyah Idris")
                moveAboutMe.putExtra(AboutMe.myEmail, "andiilhamsyahidris@gmail.com")
                startActivity(moveAboutMe)
            }
        }
    }
}
