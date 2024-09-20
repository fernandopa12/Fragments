package com.fernando.aulafragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class CadastroFragment : Fragment() {
    private lateinit var btnEnviar:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_cadastro, container, false)

        btnEnviar = view.findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener{
            Log.i("teste","Clicado")
        }




       return view
    }

}