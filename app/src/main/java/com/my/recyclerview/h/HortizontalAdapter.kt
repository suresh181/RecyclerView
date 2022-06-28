package com.my.recyclerview.h

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.my.recyclerview.R

class HortizontalAdapter(private val context:Context,private val title:Array<String>,private val image:Array<Int>):RecyclerView.Adapter<HortizontalAdapter.hortizontalHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): hortizontalHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.hortizontal_card_view,parent,false)
        return hortizontalHolder(view)
    }

    override fun onBindViewHolder(holder: hortizontalHolder, position: Int) {
        holder.imageView.setImageResource(image[position])
        holder.textView.text = title[position]
    }

    override fun getItemCount(): Int {
        return title.size
    }



    class hortizontalHolder(ItemView:View):RecyclerView.ViewHolder(ItemView) {
        val imageView:ImageView = itemView.findViewById(R.id.iv_himage)
        val textView:TextView = itemView.findViewById(R.id.tv_htext)
    }


}