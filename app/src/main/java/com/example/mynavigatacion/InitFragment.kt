package com.example.mynavigatacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.VIEW_MODEL_STORE_OWNER_KEY
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.mynavigatacion.databinding.FragmentInitBinding


class InitFragment : Fragment() {
    private var _binding : FragmentInitBinding? = null
    private val binding get() = _binding!!
    var cont = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInitBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvContador.setOnClickListener {
            cont++
            binding.tvContador.text = cont.toString()
        }
        binding.btnInit1.setOnClickListener {
            val bundle = bundleOf("Contador" to cont.toString())
            view.findNavController().navigate(R.id.action_initFragment_to_firstFragment, bundle)
        }
        binding.btnInit2.setOnClickListener {
            val cont = 22

            val action = InitFragmentDirections.actionInitFragmentToSecondFragment(cont) //este cont es el de la variable
            view.findNavController().navigate(action)
//            view.findNavController().navigate(R.id.action_initFragment_to_secondFragment, null)
        }

        //navegacion con Safe Args

    }
}
