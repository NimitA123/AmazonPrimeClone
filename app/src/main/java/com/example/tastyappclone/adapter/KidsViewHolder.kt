package com.example.tastyappclone.adapter

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.tastyappclone.OnItemClickListener
import com.example.tastyappclone.R
import com.example.tastyappclone.data.model.Kids.DataDtO
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.kids_item_layout.view.*

class KidsViewHolder(itemView: View,var  onItemClickListener: OnItemClickListener) : RecyclerView.ViewHolder(itemView) {

    fun setData(data: DataDtO) {
        var index:Int = 0

       Picasso.get().load(data.image).placeholder(R.drawable.bannerimage1).into(itemView.image1)
        //  Glide.with(itemView.image2.context).load(data.image.toString()).into(itemView.image2)
       /* if(data!= null) {
            itemView.textView3.text = data.movieName.toString()

        }
        else{
            itemView.textView3.text = "Mausam"
        }*/
        println(data.movieTrailerLink.toString())
        itemView.Kids_Card_View.setOnClickListener {
            onItemClickListener.onItemClick(data.image.toString(), data.movieName.toString(), data.description.toString(), data.year.toString()
            , data.movieTrailerLink.toString(), data.rating.toString(), data.directorImage.toString())
        }
    }

}