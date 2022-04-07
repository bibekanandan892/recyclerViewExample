package com.example.testrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager= LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        val users= ArrayList<model>()
        //adding some dummy data to the list
        users.add(model("Belal Khan", "Ranchi Jharkhand"))
        users.add(model("Ramiz Khan", "Ranchi Jharkhand"))
        users.add(model("Faiz Khan", "Ranchi Jharkhand"))
        users.add(model("Yashar Khan", "Ranchi Jharkhand"))
        val adapter = RecyclerAdapter(users)
        recyclerView.adapter= adapter


    }
}