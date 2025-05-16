package com.example.coctails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.coctails.databinding.FragmentAppInfoBinding

class AppInfoFragment : Fragment() {

    private var _binding: FragmentAppInfoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAppInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.infoText.text = "This app provides a list of popular cocktails. You can view the recipes for classic and tropical drinks, as well as learn how to make them."
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
