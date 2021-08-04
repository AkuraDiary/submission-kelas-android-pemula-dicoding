package com.example.submissionkelasandroidpemula.detail

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submissionkelasandroidpemula.R
import com.example.submissionkelasandroidpemula.about.About

class TanamanDetail : AppCompatActivity(){
    private lateinit var detail_tanaman :TextView
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_detail_tanaman)
        val actionBar = supportActionBar
        actionBar!!.title="Detail Tanaman"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val setNama: TextView = findViewById(R.id.set_nama)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tDetail: TextView = findViewById(R.id.set_deskripsiTanaman)

        val nama = intent.getStringExtra(EXTRA_NAME)
        val gambar = intent.getIntExtra(EXTRA_PHOTO, 0)
        val details = intent.getStringExtra(EXTRA_DETAIL)
        //gambar?.toInt()


        setNama.text = nama
        Glide.with(this)
            .load(gambar.toInt())
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tDetail.text = details

        if(savedInstanceState != null){
            val detail_result = savedInstanceState.getString(TanamanDetail.EXTRA_DETAIL)
            detail_tanaman.text = detail_result
        }
    }

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "poto"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(TanamanDetail.EXTRA_DETAIL, detail_tanaman.text.toString())
    }
}