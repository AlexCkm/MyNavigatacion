package com.example.mynavigatacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.mynavigatacion.databinding.FragmentFirstBinding
import com.example.mynavigatacion.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private val args: SecondFragmentArgs by navArgs() //previamente se ha creado un nav_grahp.xmlo un argumento para este Framento
    private var _binding : FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val contador = args.cont
        binding.textView2.text = contador.toString() // Recepcion argumentos con Safe Args

        binding.btnSecond.setOnClickListener {
            view.findNavController().navigate(R.id.action_secondFragment_to_initFragment, null)
        }
        binding.btnSecond2.setOnClickListener {
            view.findNavController().navigate(R.id.action_secondFragment_to_thirdFragment,null)
        }
    }

}