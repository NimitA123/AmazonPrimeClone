package com.example.tastyappclone.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.tastyappclone.OnItemClickListener2
import com.example.tastyappclone.R
import com.example.tastyappclone.data.model.Thriller.ThrillerDataDTO
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.tasty_item_layout.view.*
import kotlinx.android.synthetic.main.triller_item_layout.view.*

class ThrillerViewHolder(itemView: View, var onItemClickListener2: OnItemClickListener2) : RecyclerView.ViewHolder(itemView) {
    fun setData(data: ThrillerDataDTO) {
        Picasso.get().load(data.image).placeholder(R.drawable.bannerimage1).into(itemView.image4)
        itemView.thriller_item_layout.setOnClickListener {
            onItemClickListener2.onItemClick2(data.image.toString(), data.name.toString(), data.description.toString(), data.year.toString()
                , data.movieTrailerLink.toString(), data.rating.toString(), data.directorImage.toString())
        }

    }
}