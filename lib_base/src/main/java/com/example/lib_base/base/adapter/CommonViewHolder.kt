package com.example.lib_base.base.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CommonViewHolder(private val viewItem: View) : RecyclerView.ViewHolder(viewItem) {
    private var viewMaps: MutableMap<Int, View> = hashMapOf()

    companion object {
        fun createViewHolder(view: View): CommonViewHolder {
            return CommonViewHolder(view)
        }
    }


    fun getView(id: Int): View {
        return if (viewMaps[id] != null) {
            viewMaps[id]!!
        } else {
            val view = viewItem.findViewById<View>(id)
            viewMaps[id] = view
            view
        }
    }


    fun setText(id: Int, str: String) {
        (getView(id) as TextView).text = str
    }

    fun setImageSource(id: Int, imgSrc: Int) {
        (getView(id) as ImageView).setImageResource(imgSrc)
    }

    fun setItemClickListener(id: Int, onClickListener: View.OnClickListener) {
        getView(id).setOnClickListener { onClickListener.onClick(it) }
    }


}