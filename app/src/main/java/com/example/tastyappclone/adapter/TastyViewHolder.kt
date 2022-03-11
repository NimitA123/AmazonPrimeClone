package com.example.tastyappclone.adapter


import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.tastyappclone.R
import com.example.tastyappclone.data.model.*

import com.squareup.picasso.Picasso

import kotlinx.android.synthetic.main.tasty_item_layout.view.*

class TastyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun setData(data: DataDTO) {
         var index:Int = 0
        Picasso.get().load(data.image).placeholder(R.drawable.bannerimage1).into(itemView.image)
       //  Glide.with(itemView.image2.context).load(data.image.toString()).into(itemView.image2)
        if(data!= null) {
            itemView.textView2.text =data.movieName.toString()

        }
        else{
            itemView.textView2.text = "Mausam"
        }
    }
}


