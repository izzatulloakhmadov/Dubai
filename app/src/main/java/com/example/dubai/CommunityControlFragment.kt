package com.example.dubai

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.dubai.databinding.FragmentCommunityControlBinding

class CommunityControlFragment : Fragment() {
lateinit var binding: FragmentCommunityControlBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentCommunityControlBinding.inflate(layoutInflater)
        return  binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imagev.setOnClickListener {
            findNavController().navigate(R.id.action_communityControlFragment_to_profileFragment)
        }
        binding.imagex.setOnClickListener {
            findNavController().navigate(R.id.action_communityControlFragment_to_addComunnityFragment)
        }
    }
}