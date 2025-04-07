package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentMainBinding
import com.example.myapplication.fragments.AlbumsFragment
import com.example.myapplication.fragments.ArtistsFragment
import com.example.myapplication.fragments.SongsFragment

class MainFragment : Fragment() {

    private var _binding : FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    private fun loadFragment(f : Fragment){
        parentFragmentManager
            .beginTransaction()
            .replace(R.id.mainFragment,f)
            .commit()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding){
        super.onViewCreated(view, savedInstanceState)

        loadFragment(SongsFragment.newInstance())

        bottomNavMenu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.songs -> {
                    loadFragment(SongsFragment.newInstance())
                    true
                }
                R.id.Albums -> {
                    loadFragment(AlbumsFragment.newInstance())
                    true
                }
                R.id.Artists -> {
                    loadFragment(ArtistsFragment.newInstance())
                    true
                }
                else -> {
                    loadFragment(SongsFragment.newInstance())
                    true
                }
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }
}