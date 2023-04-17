package com.example.morningsimplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mylistview=findViewById<ListView>(R.id.Listview)
        val names= arrayOf("Kenya","Uganda","Tanzania","Ethiopia","Rwanda","Sudan","Egypt","Burundi","Madagascar","South Africa")
        val myarrayadapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,names)
        mylistview.adapter=myarrayadapter

       mylistview.setOnItemClickListener { parent, view, position, id ->
           Toast.makeText(this,"You have clicked "+names[position],Toast.LENGTH_LONG).show()
       }
    }
}