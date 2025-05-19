package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapters.RetrofitRecyclerView
import com.example.myapplication.databinding.FragmentArtistsBinding
import com.example.myapplication.models.RetrofitItem
import com.example.myapplication.service.RetrofitBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ArtistsFragment : Fragment() {

    private lateinit var binding : FragmentArtistsBinding
    private lateinit var retrofitRVAdapter : RetrofitRecyclerView

    private val retrofitList = mutableListOf<RetrofitItem>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentArtistsBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding){
        super.onViewCreated(view, savedInstanceState)

        retrofitRVAdapter = RetrofitRecyclerView(retrofitList)
        retrofitRecyclerView.adapter = retrofitRVAdapter
        retrofitRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        fetchData()
    }

    private fun fetchData() {

        RetrofitBuilder.api.getPosts().enqueue(object : Callback<List<RetrofitItem>>{
            override fun onResponse(
                call: Call<List<RetrofitItem>>,
                response: Response<List<RetrofitItem>>
            ) {
                if(response.isSuccessful){
                    val posts = response.body()
                    if (posts != null) {
                        retrofitList.clear()
                        retrofitList.addAll(posts)
                        retrofitRVAdapter.notifyDataSetChanged()
                    }
                } else {
                    Toast.makeText(
                        requireContext(),
                        "Error: ${response.code()}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

            override fun onFailure(call: Call<List<RetrofitItem>>, t: Throwable) {
                Toast.makeText(requireContext(), "Failed: ${t.message}", Toast.LENGTH_SHORT).show()
            }

        })

    }

    companion object {
        @JvmStatic
        fun newInstance() =
            ArtistsFragment()
    }
}