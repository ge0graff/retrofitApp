package com.example.kochetkov.ui.fragments.mainFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.example.kochetkov.databinding.FragmentMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get () = _binding!!

    private val viewModel by viewModel<MainFragmentViewModel>()

    private val adapter = MainAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imRcView.adapter = adapter
        binding.imRcView.layoutManager = GridLayoutManager(requireContext(), 2)

        viewModel.getImage()
        viewModel.imageList.observe(viewLifecycleOwner, Observer {list->
            list.body()?.let { adapter.setList(it) }
        })



    }

}