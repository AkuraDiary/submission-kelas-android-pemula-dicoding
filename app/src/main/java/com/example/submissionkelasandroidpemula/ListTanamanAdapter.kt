package com.example.submissionkelasandroidpemula

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
/*
class ListTanamanAdapter(val List_tanaman: ArrayList<Tanaman>) : RecyclerView.Adapter<ListTanamanAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var NamaTanaman: TextView = itemView.findViewById(R.id.tv_item_name)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val daftar = List_tanaman[position]
        Glide.with(holder.itemView.context)
            .load(daftar.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.NamaTanaman.text = daftar.nama
        //holder.tvDetail.text = hero.detail
    }

    override fun getItemCount(): Int {
        return List_tanaman.size
    }
}*/