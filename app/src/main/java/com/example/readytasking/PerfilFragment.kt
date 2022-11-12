package com.example.readytasking

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class PerfilFragment : Fragment() {
   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfil, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button=view.findViewById<BottomNavigationView>(R.id.buttonNavigationMenu)
        val per = view.findViewById<ImageView>(R.id.perfil)
        button.setOnNavigationItemReselectedListener {
            when(it.itemId){
                com.airbnb.lottie.R.id.home->findNavController().navigate(R.id.action_menuFragment2_to_perfilFragment)
            }
        }
        per.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment2_to_perfilFragment)
        }
    }

}