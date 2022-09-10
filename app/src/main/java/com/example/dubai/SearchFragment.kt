package com.example.dubai

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ListAdapter
import com.example.dubai.databinding.FragmentSearchBinding
import com.example.dubai.databinding.TableItemBinding

class SearchFragment : Fragment() {

    val list = arrayListOf<hause>(
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100),
        hause("marina", 12, 11, 100)
    )

    lateinit var binding: FragmentSearchBinding
    lateinit var listAdapter: listAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.boss.setOnClickListener {
            findNavController().navigate(R.id.action_searchFragment_to_bottomSheetFragment)
        }
        listAdapter = listAdapter()
        binding.recyclerview.adapter = listAdapter
        listAdapter.submitList(list)
    }
}