package com.example.aivoice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lib_base.base.adapter.CommonRecyclerAdapter
import com.example.lib_base.base.adapter.CommonViewHolder

class MainActivity : AppCompatActivity() {
    private val data= arrayListOf<String>("a","b","c","d")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val adapter= CommonRecyclerAdapter<String>(data,object :CommonRecyclerAdapter.OneViewTypeCreate{
           override fun getLayoutId(): Int {
               TODO("Not yet implemented")
           }

           override fun convert(holder: CommonViewHolder, position: Int) {
               holder.setItemClickListener(R.id.NO_DEBUG,
                   View.OnClickListener { TODO("Not yet implemented") })
           }
       })
    }
}