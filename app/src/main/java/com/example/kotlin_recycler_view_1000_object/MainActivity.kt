package com.example.kotlin_recycler_view_1000_object


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin_recycler_view_1000_object.Constructor_Post
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException
import java.io.InputStream


class MainActivity : AppCompatActivity() {


    private lateinit var recyclerAdapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        recyclerAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        val data = DataSource.createDataSet()
        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            recyclerAdapter = RecyclerViewAdapter(data)
            adapter = recyclerAdapter
        }
    }

}
