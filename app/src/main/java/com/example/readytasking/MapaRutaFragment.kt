package com.example.readytasking

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.ImageView
import androidx.navigation.fragment.findNavController

class MapaRutaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mapa_ruta, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val map = view.findViewById<ImageView>(R.id.mapa)
        map.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment2_to_mapaRutaFragment)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_navigation_toolbar,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.ayuda->{
                findNavController().navigate(R.id.action_mapaRutaFragment_to_ayudaFragment)
                true
           }
            R.id.agenda->{
                findNavController().navigate(R.id.action_mapaRutaFragment_to_agendarCitaFragment)
                true
            }
            else -> super.onOptionsItemSelected(item)

        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }
}