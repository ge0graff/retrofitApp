package com.example.kochetkov.ui.fragments.secondFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.kochetkov.R
import com.example.kochetkov.databinding.FragmentMainBinding
import com.example.kochetkov.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getImage()
    }

    fun getImage(){
        val image = arguments?.get("image")
        binding.apply {
            Glide.with(this@SecondFragment)
                .load(image)
                .centerCrop()
                .into(imageView)
        }
    }
}