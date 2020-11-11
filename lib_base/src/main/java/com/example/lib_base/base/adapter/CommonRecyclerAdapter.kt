package com.example.lib_base.base.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CommonRecyclerAdapter<T>() : RecyclerView.Adapter<CommonViewHolder>() {


    private lateinit var data: List<T>

    private var oneViewTypeCreate: OneViewTypeCreate? = null
    private var moreViewTypeCreate: MoreViewTypeCreate? = null

    constructor(data: List<T>, oneViewTypeCreate: OneViewTypeCreate) : this() {
        this.data = data
        this.oneViewTypeCreate = oneViewTypeCreate
    }

    constructor(data: List<T>, moreViewTypeCreate: MoreViewTypeCreate) : this() {
        this.data = data
        this.moreViewTypeCreate = moreViewTypeCreate
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(
                if (oneViewTypeCreate == null) moreViewTypeCreate!!.getLayoutId() else oneViewTypeCreate!!.getLayoutId(),
                parent,
                false
            )
        return CommonViewHolder.createViewHolder(view)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: CommonViewHolder, position: Int) {
        if (oneViewTypeCreate == null) moreViewTypeCreate!!.convert(
            holder,
            position
        ) else oneViewTypeCreate!!.convert(holder, position)
    }

    override fun getItemViewType(position: Int): Int {
        return moreViewTypeCreate!!.getItemType(position)
    }


    interface OneViewTypeCreate {
        fun getLayoutId(): Int


        fun convert(holder: CommonViewHolder, position: Int)


    }

    interface MoreViewTypeCreate : OneViewTypeCreate {
        fun getItemType(position: Int): Int
    }
}