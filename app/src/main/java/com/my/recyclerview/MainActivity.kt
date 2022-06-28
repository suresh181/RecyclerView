package com.my.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.my.recycler.ItemViewModels
import com.my.recycler.RecyclerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        val data = ArrayList<ItemViewModels>()

        for (i in 1..20){
            data.add(ItemViewModels(R.drawable.ic_baseline_airplay_24,"Item"+i))

        }

        val adapter = RecyclerAdapter(this,data)

        recyclerView.adapter = adapter


    }
}