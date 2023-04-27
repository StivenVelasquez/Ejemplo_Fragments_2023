package com.stivenvelasquez.ejemplofragments2023

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stivenvelasquez.ejemplofragments2023.databinding.FragmentWonderWomanBinding


class WonderWomanFragment : Fragment() {

    private lateinit var wonderWomanBinding: FragmentWonderWomanBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        wonderWomanBinding=FragmentWonderWomanBinding.inflate(inflater,container,false)
        val view=wonderWomanBinding.root
        return view
    }
}