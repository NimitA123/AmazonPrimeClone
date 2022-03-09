package com.example.tastyappclone.adapter

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.tastyappclone.R
import com.example.tastyappclone.data.model.Popular.PopularDTO
import com.example.tastyappclone.data.model.Popular.PopularDataDTO

import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.action_item_layout.view.*
import kotlinx.android.synthetic.main.tasty_item_layout.view.*

class PopularViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun setData(data: PopularDataDTO) {
        Picasso.get().load(data.image).placeholder(R.drawable.img).into(itemView.image2)
        //  Glide.with(itemView.image2.context).load(data.image.toString()).into(itemView.image2)
        if(data.movieName.toString()!= null) {
            Log.d("Mausam",data.movieName.toString())
            itemView.textView4.text = data.movieName.toString()

        }
        else{
            itemView.textView4.text = "Mausam"
        }
    }
}