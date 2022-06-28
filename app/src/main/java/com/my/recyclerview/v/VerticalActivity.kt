package com.my.recyclerview.v

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.my.recyclerview.R

class VerticalActivity : AppCompatActivity() {
    private val title = arrayOf(
        "MS Dhoni",
        "Suresh Raina",
        "Moeen Ali",
        "Ravindra Jadeja",
        "Dwayne Bravo",
        "C Hari Nishaanth",
        "Sam Curran",
        "Robin Uthappa",
        "Ruturaj Gaikwad",
        "Ambati Rayudu",
        )
    private val imageId = arrayOf(R.drawable.msdhoni,R.drawable.suresh,R.drawable.alic,R.drawable.jadc,
        R.drawable.cbravo,R.drawable.hari,R.drawable.samc,R.drawable.uthappa,R.drawable.rutuc,
        R.drawable.ambati)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vertical)

        val recyclerVertical = findViewById<RecyclerView>(R.id.recycler_vertical)

        recyclerVertical.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        val verticalAdapter = verticalAdapter(this,title,imageId)

        recyclerVertical.adapter = verticalAdapter

    }
}