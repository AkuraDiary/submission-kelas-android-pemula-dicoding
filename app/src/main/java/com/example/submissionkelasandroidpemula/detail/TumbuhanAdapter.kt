package com.example.submissionkelasandroidpemula.detail

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submissionkelasandroidpemula.R

class TumbuhanAdapter (val LIST: ArrayList<Tumbuhan>) : RecyclerView.Adapter<TumbuhanAdapter.ListViewHolder>(){
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var namaTumbuhan: TextView = itemView.findViewById(R.id.tv_item_name)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater
            .from(viewGroup.context)
            .inflate(R.layout.item_row, viewGroup,false )
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val(name, photo, detail) = LIST[position]
        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.namaTumbuhan.text = name

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, TanamanDetail::class.java)
            //val photoVar:String = "TanamanDetail.EXTRA_PHOTO"
            moveDetail.putExtra(TanamanDetail.EXTRA_NAME, name)
            moveDetail.putExtra(TanamanDetail.EXTRA_PHOTO.toString(), photo)
            moveDetail.putExtra(TanamanDetail.EXTRA_DETAIL, detail)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return LIST.size
    }
}