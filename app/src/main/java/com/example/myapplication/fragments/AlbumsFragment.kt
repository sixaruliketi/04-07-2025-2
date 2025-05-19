package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapters.AlbumsRVAdapterList
import com.example.myapplication.adapters.RecyclerViewAdapter
import com.example.myapplication.databinding.FragmentAlbumsBinding
import com.example.myapplication.models.Post

class AlbumsFragment : Fragment() {

    private var _binding:FragmentAlbumsBinding?=null
    private val binding get() = _binding!!

    lateinit var albumsRVAdapter : AlbumsRVAdapterList

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      _binding= FragmentAlbumsBinding.inflate(layoutInflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.appCompatButton.setOnClickListener {
            Toast.makeText(requireContext(), "you clicked!", Toast.LENGTH_SHORT).show()
        }

        binding.apply {
            albumsRVAdapter = AlbumsRVAdapterList(getItem())

            albumsRV.adapter = albumsRVAdapter

            albumsRV.layoutManager = LinearLayoutManager(requireContext(),
                LinearLayoutManager.HORIZONTAL,false)

        }

    }

    private fun getItem(): List<Post> {
        val list = mutableListOf(
            Post("https://images.pexels.com/photos/3680219/pexels-photo-3680219.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","Author 1"),
            Post("https://st.depositphotos.com/2001755/3622/i/450/depositphotos_36220949-stock-photo-beautiful-landscape.jpg","Author 2"),
            Post("https://archive.smashing.media/assets/344dbf88-fdf9-42bb-adb4-46f01eedd629/d0699f3a-3ce3-43c3-b129-9d1f3bdcc79c/photos-31.jpg","Author 3"),
            Post("https://images.pexels.com/photos/3680219/pexels-photo-3680219.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","Author 1"),
            Post("https://images.pexels.com/photos/3680219/pexels-photo-3680219.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","Author 1"),
            Post("https://images.pexels.com/photos/3680219/pexels-photo-3680219.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","Author 1"),
            Post("https://st.depositphotos.com/2001755/3622/i/450/depositphotos_36220949-stock-photo-beautiful-landscape.jpg","Author 2"),
            Post("https://images.pexels.com/photos/3680219/pexels-photo-3680219.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","Author 1"),
            Post("https://st.depositphotos.com/2001755/3622/i/450/depositphotos_36220949-stock-photo-beautiful-landscape.jpg","Author 2"),
            )
        return list
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            AlbumsFragment()
    }
}