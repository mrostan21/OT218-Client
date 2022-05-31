package com.melvin.ongandroid.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.melvin.ongandroid.databinding.ActivityMainBinding
import com.melvin.ongandroid.databinding.ActivityNavigationBinding
import com.melvin.ongandroid.viewmodel.MainActivityViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavigationBinding
    private val viewModel by viewModels<MainActivityViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Show Spinner Loading
        viewModel.isShowProgress()



    }
}