package com.example.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.calculator.databinding.FragmentFirstBinding
import java.nio.channels.FileLock
import android.R
import android.widget.Button

import android.widget.TextView




/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {


    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?, ) {
        super.onViewCreated(view, savedInstanceState)
        var x1 : Float
        var x2 : Float
        binding.button14.setOnClickListener {Expressao("0", limpar = true)  }
        binding.button5.setOnClickListener {Expressao("1", limpar = true)  }
        binding.button6.setOnClickListener {Expressao("2", limpar = true)  }
        binding.button7.setOnClickListener {Expressao("3", limpar = true)  }
        binding.button8.setOnClickListener {Expressao("4", limpar = true)  }
        binding.button9.setOnClickListener {Expressao("5", limpar = true)  }
        binding.button10.setOnClickListener {Expressao("6", limpar = true)  }
        binding.button11.setOnClickListener {Expressao("7", limpar = true)  }
        binding.button12.setOnClickListener {Expressao("8", limpar = true)  }
        binding.button13.setOnClickListener {Expressao("9", limpar = true)  }








        binding.buttonFirst.setOnClickListener {
            x1 = binding.editTextNumber.text.toString().toFloat()
            x2 = binding.editTextNumber2.text.toString().toFloat()

            var text = x1+x2

            binding.textView.text = text.toString()
        }
        binding.button.setOnClickListener {
            x1 = binding.editTextNumber.text.toString().toFloat()
            x2 = binding.editTextNumber2.text.toString().toFloat()

            var text = x1-x2

            binding.textView.text = text.toString()
        }
        binding.button2.setOnClickListener {
            x1 = binding.editTextNumber.text.toString().toFloat()
            x2 = binding.editTextNumber2.text.toString().toFloat()

            var text = x1*x2

            binding.textView.text = text.toString()
        }
        binding.button3.setOnClickListener {
            x1 = binding.editTextNumber.text.toString().toFloat()
            x2 = binding.editTextNumber2.text.toString().toFloat()

            var text = x1/x2

            binding.textView.text = text.toString()
        }

    }
    fun Expressao(String: String, limpar : Boolean){
        if(binding.editTextNumber.text.isNotEmpty()){
            binding.textView.text = ""
        }
        if (limpar){
            binding.textView.text = ""
            binding.editTextNumber.append(String)
        }else{
            binding.editTextNumber2.append(binding.textView.text)
            binding.editTextNumber2.append(String)
            binding.textView.text = ""
        }




    }





    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}