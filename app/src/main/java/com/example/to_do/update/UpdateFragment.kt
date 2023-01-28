package com.example.to_do.update

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.to_do.R
import com.example.to_do.databinding.FragmentListBinding
import com.example.to_do.databinding.FragmentUpdateBinding

class UpdateFragment : Fragment() {
    private lateinit var binding: FragmentUpdateBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_update, container, false)
    }


}