package com.example.tastyappclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.webkit.WebSettings
import androidx.recyclerview.widget.RecyclerView
import com.example.tastyappclone.OnItemClickListener2
import com.example.tastyappclone.R
import com.example.tastyappclone.data.model.Thriller.ThrillerDataDTO

class ThrillerAdapter(var arrayList3: ArrayList<ThrillerDataDTO>,var  onItemClickListener2: OnItemClickListener2):RecyclerView.Adapter<ThrillerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThrillerViewHolder {
       var view = LayoutInflater.from(parent.context).inflate(R.layout.triller_item_layout, parent, false)
        return ThrillerViewHolder(view, onItemClickListener2)
    }

    override fun onBindViewHolder(holder: ThrillerViewHolder, position: Int) {
       var data = arrayList3.get(position)
       return holder.setData(data)
    }

    override fun getItemCount(): Int {
      return arrayList3.size
    }
}