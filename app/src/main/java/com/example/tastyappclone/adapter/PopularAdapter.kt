package com.example.tastyappclone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tastyappclone.OnItemClickListener
import com.example.tastyappclone.R
import com.example.tastyappclone.data.model.Popular.PopularDataDTO


class PopularAdapter(var arrayList2: ArrayList<PopularDataDTO>) : RecyclerView.Adapter<PopularViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
       var view = LayoutInflater.from(parent.context).inflate(R.layout.action_item_layout, parent, false)
        return PopularViewHolder(view)


    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        var data = arrayList2.get(position)
        return holder.setData(data)
    }

    override fun getItemCount(): Int {
        return arrayList2.size
    }

}