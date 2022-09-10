package com.example.dubai

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.dubai.databinding.FragmentPlasControlBinding

class plasControlFragment : Fragment() {
   lateinit var binding: FragmentPlasControlBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     binding=FragmentPlasControlBinding.inflate(layoutInflater)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imagev.setOnClickListener {
            findNavController().navigate(R.id.action_plasControlFragment_to_userControlFragment)
        }
    }
}