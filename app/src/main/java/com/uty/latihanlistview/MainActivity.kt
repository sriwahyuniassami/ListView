package com.uty.latihanlistview

import android.R.layout.simple_list_item_1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //data yang akan ditampilkan kedalam listview
        val languages = listOf("Kotlin","Python","Ruby","JavaScript","PHP")
        //memberikan adapter ke ListView
        list_view.adapter = ArrayAdapter(this, simple_list_item_1,languages)
        //menampilkan item saat di klik
        list_view.setOnItemClickListener{ parent, view, position, id ->
            Toast.makeText(this,"Anda Memilih: ${languages[position]}",Toast.LENGTH_SHORT).show()}
    }
}
