package com.example.newsapp

import Adapter.ListSourceAdapter
import Interface.NewsService
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ThemedSpinnerAdapter
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {

    lateinit var layoutManager: LinearLayoutManager
    lateinit var mService: NewsService
    lateinit var adapter: ListSourceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}