package com.example.examapp_doctorapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examapp_doctorapp.R

class Adapter(var list : List<Int>, val listener : OnItemClickListener) :
    RecyclerView.Adapter<Adapter.ViewHolder>()

{
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var buttonId = itemView.findViewById<TextView>(R.id.openId)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent, false)
        )
    }
    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        holder.buttonId.setOnClickListener {
            listener.onItemClick()
        }
    }
}

interface OnItemClickListener {
    fun onItemClick()
}