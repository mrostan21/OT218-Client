package com.melvin.ongandroid.view.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.melvin.ongandroid.R
import com.melvin.ongandroid.databinding.FragmentSignUpBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentSignUp : Fragment() {

    private lateinit var binding:FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding=FragmentSignUpBinding.inflate(layoutInflater, container, false)

        goLogIn()

        return binding.root
    }

    // Navegation to Log In fragment
    private fun goLogIn() {
        binding.btnBackLogIn.setOnClickListener{
            it.findNavController().popBackStack()
        }
    }
}