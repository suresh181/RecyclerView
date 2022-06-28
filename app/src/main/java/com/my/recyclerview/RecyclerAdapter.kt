package com.my.recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.my.recyclerview.R

class RecyclerAdapter(private val context:Context,private val mList:List<ItemViewModels>):RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.iv_image)
        val textView: TextView = itemView.findViewById(R.id.tv_text)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val view = LayoutInflater.from(context).inflate(R.layout.card_view_design,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val itemList = mList[position]
        holder.imageView.setImageResource(itemList.image)
        holder.textView.text = itemList.text
    }

    override fun getItemCount(): Int {
       return mList.size
    }
}

