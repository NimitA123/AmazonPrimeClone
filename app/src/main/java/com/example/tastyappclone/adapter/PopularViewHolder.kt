package com.example.tastyappclone.adapter

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.tastyappclone.OnItemClickListener3
import com.example.tastyappclone.R
import com.example.tastyappclone.data.model.Popular.PopularDataDTO

import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.action_item_layout.view.*


class PopularViewHolder(itemView: View, var onItemClickListener3: OnItemClickListener3) : RecyclerView.ViewHolder(itemView) {
    fun setData(data: PopularDataDTO) {
        Picasso.get().load(data.image).placeholder(R.drawable.bannerimage1).into(itemView.image2)
        itemView.action_item_layout.setOnClickListener {
            onItemClickListener3.onItemClick3(data.image.toString(), data.movieName.toString(), data.description.toString(), data.year.toString()
                , data.movieTrailerLink.toString(), data.rating.toString(), data.directorImage.toString())
        }

    }
    }
