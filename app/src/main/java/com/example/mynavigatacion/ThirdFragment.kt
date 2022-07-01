package com.example.mynavigatacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.mynavigatacion.databinding.FragmentSecondBinding
import com.example.mynavigatacion.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
    private var _binding : FragmentThirdBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThirdBinding.inflate(inflater,container, false)
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnThird1.setOnClickListener {
            view.findNavController().navigate(R.id.action_thirdFragment_to_secondFragment, null)
        }
        binding.btnThird2.setOnClickListener {
            view.findNavController().navigate(R.id.action_thirdFragment_to_initFragment, null)
        }
    }
}