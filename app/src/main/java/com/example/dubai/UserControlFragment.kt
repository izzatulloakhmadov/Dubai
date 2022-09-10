package com.example.dubai

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.dubai.databinding.FragmentUserControlBinding

class UserControlFragment : Fragment() {
  lateinit var binding: FragmentUserControlBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
 binding=FragmentUserControlBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.plas.setOnClickListener {
            findNavController().navigate(R.id.action_userControlFragment_to_plasControlFragment)
        }
        binding.imagev.setOnClickListener {
            findNavController().navigate(R.id.action_userControlFragment_to_profileFragment)
        }
    }}