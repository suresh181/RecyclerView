package com.my.recyclerview.v

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.my.recyclerview.R

class verticalAdapter(private val context:Context,private val title:Array<String>,private val imageId:Array<Int>):RecyclerView.Adapter<verticalAdapter.verticalHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): verticalAdapter.verticalHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.card_view_design,parent,false)
        return verticalHolder(view)
    }

    override fun onBindViewHolder(holder: verticalAdapter.verticalHolder, position: Int) {
        holder.imageView.setImageResource(imageId[position])
        holder.textView.text = title[position]
    }

    override fun getItemCount(): Int {
        return title.size
    }

    class verticalHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.iv_image)
        val textView: TextView = itemView.findViewById(R.id.tv_text)
    }
}