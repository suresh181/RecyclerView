package com.my.recyclerview.grid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.my.recyclerview.R

class GridAdapter(private val context:Context,private val title:Array<String>,private val image:Array<Int>):RecyclerView.Adapter<GridAdapter.gridHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridAdapter.gridHolder {
       val view = LayoutInflater.from(context).inflate(R.layout.grid_card_deisgn,parent,false)
        return gridHolder(view)
    }

    override fun onBindViewHolder(holder: GridAdapter.gridHolder, position: Int) {
        holder.imageView.setImageResource(image[position])
        holder.textView.text = title[position]
    }

    override fun getItemCount(): Int {
        return title.size
    }

    class gridHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
        val imageView = itemView.findViewById<ImageView>(R.id.iv_gimage)
        val textView = itemView.findViewById<TextView>(R.id.tv_gtext)
    }
}