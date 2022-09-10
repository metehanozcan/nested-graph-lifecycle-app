package com.patika.week3appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.patika.week3appnavigation.databinding.FragmentTwoFABinding


class TwoFAFragment : Fragment() {

    private lateinit var fragmentLoginBinding: FragmentTwoFABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //fragmentLoginBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false)
        fragmentLoginBinding = FragmentTwoFABinding.inflate(layoutInflater)
        return fragmentLoginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentLoginBinding.apply {
            button2fa.setOnClickListener {
                findNavController().navigate(R.id.action_twoFAFragment_to_dialogScreen)
            }
        }
    }
}