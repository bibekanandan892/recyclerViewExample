package com.example.testrecyclerview

import android.graphics.ColorSpace
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter constructor(val itemList : ArrayList<model>) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return MyViewHolder(v)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindView(itemList[position])
    }
    override fun getItemCount(): Int {
        return itemList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(model: model){
            val tvName=  itemView.findViewById(R.id.tvName) as TextView
            val tvPrice= itemView.findViewById(R.id.tvPrice) as TextView
            tvName.text = model.name
            tvPrice.text = model.price
        }

    }
}