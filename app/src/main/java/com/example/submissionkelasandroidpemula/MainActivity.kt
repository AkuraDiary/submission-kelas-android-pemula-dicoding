package com.example.submissionkelasandroidpemula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.submissionkelasandroidpemula.about.About
import com.example.submissionkelasandroidpemula.detail.DataTanaman
import com.example.submissionkelasandroidpemula.detail.TanamanDetail
import com.example.submissionkelasandroidpemula.detail.Tumbuhan
import com.example.submissionkelasandroidpemula.detail.TumbuhanAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var rvTanaman: RecyclerView
    private var list:ArrayList<Tumbuhan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionbar = supportActionBar
        actionbar!!.title= "Kebun"

        rvTanaman = findViewById((R.id.rv_tanaman))
        rvTanaman.setHasFixedSize(true)

        list.addAll(DataTanaman.List_data)
        showRecyclerList()
    }
    private fun showRecyclerList(){
        rvTanaman.layoutManager = LinearLayoutManager(this)
        val listTanamanAdapter = TumbuhanAdapter(list)//ListTanamanAdapter(list)
        rvTanaman.adapter = listTanamanAdapter//listTanamanAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.miProfile -> {
                val iAbout = Intent(this@MainActivity,
                    About::class.java)
                startActivity(iAbout)
            }
        }
    }

}