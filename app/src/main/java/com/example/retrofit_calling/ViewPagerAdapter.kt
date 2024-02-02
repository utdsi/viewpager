package com.example.retrofit_calling

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(private val items: List<String>):RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerAdapter.ViewHolder {
        val view  = LayoutInflater.from(parent.context).inflate(R.layout.image_item,parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.ViewHolder, position: Int) {
        val textView = holder.itemView.findViewById<TextView>(R.id.textView)
        textView.text = items[position]
    }

    override fun getItemCount(): Int {
        return items.size

    }
}