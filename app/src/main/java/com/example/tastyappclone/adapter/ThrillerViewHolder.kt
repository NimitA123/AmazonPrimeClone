package com.example.tastyappclone.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.tastyappclone.R
import com.example.tastyappclone.data.model.Thriller.ThrillerDataDTO
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.tasty_item_layout.view.*
import kotlinx.android.synthetic.main.triller_item_layout.view.*

class ThrillerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun setData(data: ThrillerDataDTO) {
        Picasso.get().load(data.image).placeholder(R.drawable.img).into(itemView.image4)
        //  Glide.with(itemView.image2.context).load(data.image.toString()).into(itemView.image2)
        if(data!= null) {
            itemView.textView4.text = data.name.toString()

        }
        else{
            itemView.textView4.text = "Mausam"
        }
    }
}