package com.example.tastyappclone.adapter


import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.tastyappclone.OnItemClickListener
import com.example.tastyappclone.OnItemClickListener1
import com.example.tastyappclone.R
import com.example.tastyappclone.data.model.*

import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.kids_item_layout.view.*

import kotlinx.android.synthetic.main.tasty_item_layout.view.*

class TastyViewHolder(itemView: View, val onItemClickListener1: OnItemClickListener1) : RecyclerView.ViewHolder(itemView) {
    fun setData(data: DataDTO) {
         var index:Int = 0
        Picasso.get().load(data.image).placeholder(R.drawable.bannerimage1).into(itemView.image)     //  Glide.with(itemView.image2.context).load(data.image.toString()).into(itemView.image2)
        itemView.tasty_item_layout.setOnClickListener {
            onItemClickListener1.onItemClick1(data.image.toString(), data.movieName.toString(), data.description.toString(), data.year.toString()
                , data.movieTrailerLink.toString(), data.rating.toString(), data.directorImage.toString())
        }

    }
}


