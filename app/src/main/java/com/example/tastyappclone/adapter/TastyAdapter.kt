package com.example.tastyappclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tastyappclone.OnItemClickListener
import com.example.tastyappclone.OnItemClickListener1
import com.example.tastyappclone.R
import com.example.tastyappclone.data.model.DataDTO

class TastyAdapter(var TastyData: ArrayList<DataDTO>, var onItemClickListener1: OnItemClickListener1) : RecyclerView.Adapter<TastyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TastyViewHolder {
       var view = LayoutInflater.from(parent.context).inflate(R.layout.tasty_item_layout, parent, false)
       return TastyViewHolder(view, onItemClickListener1)
    }

    override fun onBindViewHolder(holder: TastyViewHolder, position: Int) {
       var data = TastyData.get(position)
        return holder.setData(data)
    }

    override fun getItemCount(): Int {
       return TastyData.size
    }
}