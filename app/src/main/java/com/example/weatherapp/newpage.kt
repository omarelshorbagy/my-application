package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.listactivity.*

class ListActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listactivity)

        val x= arrayListOf("Android", "iPhone", "Windows", "Blackberry", "Linux")

        val listView=findViewById<ListView>(R.id.listview)

        val adapter= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,x)

        listView.adapter=adapter

        listview.setOnItemClickListener{parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            if (position==0 || position==1||position==2||position==3||position==4){
                startActivity(Intent(this,devicedetail::class.java))
            }
        }



    }

}