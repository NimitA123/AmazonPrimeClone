package com.example.tastyappclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tastyappclone.R
import com.example.tastyappclone.data.model.Kids.DataDtO

class KidsAdapter(var KidsArrayList: MutableList<DataDtO>) :RecyclerView.Adapter<KidsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KidsViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.kids_item_layout, parent, false)
        return KidsViewHolder(view)
    }

    override fun onBindViewHolder(holder: KidsViewHolder, position: Int) {
        var data = KidsArrayList.get(position)
        return holder.setData(data)
    }

    override fun getItemCount(): Int {
        return KidsArrayList.size
    }
}