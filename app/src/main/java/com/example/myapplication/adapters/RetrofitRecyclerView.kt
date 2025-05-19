package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.RetrofitItemBinding
import com.example.myapplication.models.RetrofitItem

class RetrofitRecyclerView(private val retrofitList: List<RetrofitItem>)
    : RecyclerView.Adapter<RetrofitRecyclerView.RetrofitViewHolder>(){

    inner class RetrofitViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val binding = RetrofitItemBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RetrofitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.retrofit_item,parent,false)
        return RetrofitViewHolder(view)
    }

    override fun getItemCount() = retrofitList.size

    override fun onBindViewHolder(holder: RetrofitViewHolder, position: Int) {
        holder.binding.apply {
            val item = retrofitList[position]
            id.text = item.id.toString()
            title.text = item.title
            body.text = item.body
        }
    }
}