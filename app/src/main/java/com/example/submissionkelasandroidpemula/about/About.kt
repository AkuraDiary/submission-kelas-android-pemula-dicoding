package com.example.submissionkelasandroidpemula.about

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submissionkelasandroidpemula.R

class About : AppCompatActivity() {


    companion object{
        private const val NAME_RESULT = "NAME"
        private const val EMAIL_RESULT = "EMAIL"
    }
    private lateinit var myname :TextView
    private lateinit var myemail :TextView

    override fun onCreate(savedInstanceState: Bundle?){

        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)
        val actionbar = supportActionBar
        actionbar!!.title = "About"
        actionbar.setDisplayHomeAsUpEnabled(true)

        if(savedInstanceState != null){
            val name_result = savedInstanceState.getString(NAME_RESULT)
            val email_result = savedInstanceState.getString(EMAIL_RESULT)
            myname.text = name_result
            myemail.text = email_result

        }
        val fotoku: ImageView = findViewById(R.id.my_photo)
        val Img = R.drawable.my_photo

        Glide.with(this)
            .load(Img)
            .apply(RequestOptions())
            .into(fotoku)
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(NAME_RESULT, myname.text.toString())
        outState.putString(EMAIL_RESULT, myemail.text.toString())
    }
}