package com.example.readytasking.viewmodel.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.readytasking.R


class MenuFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_menu, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val medigen=view.findViewById<ImageView>(R.id.medigeneral)
        val agenda=view.findViewById<ImageView>(R.id.agenda)
        val especial=view.findViewById<ImageView>(R.id.especialista)
        val perfil=view.findViewById<ImageView>(R.id.perfil)
        val mapa=view.findViewById<ImageView>(R.id.mapa)
        val ayuda=view.findViewById<ImageView>(R.id.ayuda)
        medigen.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment2_to_medicinaGeneralFragment)
            findNavController().navigate(R.id.action_menuFragment2_to_agendarCitaFragment)
            findNavController().navigate(R.id.action_menuFragment2_to_especialistasFragment)
            findNavController().navigate(R.id.action_menuFragment2_to_perfilFragment)
            findNavController().navigate(R.id.action_menuFragment2_to_mapaRutaFragment)
            findNavController().navigate(R.id.action_menuFragment2_to_ayudaFragment)
        }
    }
}

