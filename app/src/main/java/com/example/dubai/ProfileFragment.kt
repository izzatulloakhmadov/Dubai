package com.example.dubai

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.dubai.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentProfileBinding.inflate(layoutInflater)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.addvilla.setOnClickListener{
            findNavController().navigate(R.id.action_profileFragment_to_eddVillaFragment)
        }
        binding.usesControl.setOnClickListener{
            findNavController().navigate(R.id.action_profileFragment_to_userControlFragment)
        }
        binding.importt.setOnClickListener{
            findNavController().navigate(R.id.action_profileFragment_to_importFragment)
        }
        binding.communitycontrol.setOnClickListener{
            findNavController().navigate(R.id.action_profileFragment_to_communityControlFragment)
        }
        binding.logout.setOnClickListener{
            findNavController().navigate(R.id.action_profileFragment_to_login1Fragment2)
        }

    }
}