package com.example.myapplication.fragmentsForViewPager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapters.RecyclerViewAdapter
import com.example.myapplication.databinding.FragmentFirstBinding
import com.example.myapplication.models.Post

class FirstFragment : Fragment() {

    lateinit var binding : FragmentFirstBinding
    lateinit var firstRVAdapter : RecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding){
        super.onViewCreated(view, savedInstanceState)
        firstRVAdapter = RecyclerViewAdapter(getItem())
        firstRV.adapter = firstRVAdapter
        firstRV.layoutManager = LinearLayoutManager(requireContext())


    }

    private fun getItem(): List<Post> {
        val itemList = mutableListOf(
            Post("","Author name 1","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 2","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 234","details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 234","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 534","real name, surname"),
            Post("","Author name 76","real name, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 098","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 256","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),            Post("","Author name 1","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 2","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 234","details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 234","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 534","real name, surname"),
            Post("","Author name 76","real name, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 098","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 256","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),            Post("","Author name 1","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 2","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 234","details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 234","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 534","real name, surname"),
            Post("","Author name 76","real name, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 098","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 256","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),            Post("","Author name 1","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 2","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 234","details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 234","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 534","real name, surname"),
            Post("","Author name 76","real name, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 098","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 256","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),            Post("","Author name 1","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 2","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 234","details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 234","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 534","real name, surname"),
            Post("","Author name 76","real name, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 098","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
            Post("","Author name 256","real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details, real name, surname, details"),
        )
        return itemList
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            FirstFragment()
    }
}