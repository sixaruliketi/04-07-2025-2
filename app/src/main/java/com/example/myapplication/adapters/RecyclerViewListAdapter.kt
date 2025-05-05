package com.example.myapplication.adapters

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.databinding.SecondItemBinding
import com.example.myapplication.models.Post

class RecyclerViewListAdapter : ListAdapter<Post, RecyclerViewListAdapter.ListHolder>(Comparator()){

    inner class ListHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val binding = SecondItemBinding.bind(itemView)
        fun bind(item : Post){
        // ტექსტი რომ ყოფილიყო ჩვეულებრივად შემოიტანდით მონაცემებს
        // textView.text = item.Author

            Glide
                .with(binding.root)
                .load(item.image)
                .into(binding.imageAvatarForSecondFragment)
        }
    }

    class Comparator(): DiffUtil.ItemCallback<Post>() {
        override fun areItemsTheSame(oldItem: Post, newItem: Post): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Post, newItem: Post): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.second_item,parent,false)
        return ListHolder(view)
    }

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        holder.bind(getItem(position))
    }

}