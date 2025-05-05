package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.persistableBundleOf
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.FirstItemBinding
import com.example.myapplication.models.Post

class RecyclerViewAdapter(private val itemList: List<Post>) : RecyclerView.Adapter<RecyclerViewAdapter.Holder>() {

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val binding = FirstItemBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.first_item,parent,false)
        return Holder(view)
    } // ხატავს

    override fun onBindViewHolder(holder: Holder, position: Int) {

        val item = itemList[position]

        holder.binding.apply {
            textView1.text = item.author
            textView2.text = item.details

        }
    } // ავსებს

    override fun getItemCount() = itemList.size

}