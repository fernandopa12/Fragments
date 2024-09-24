package com.fernando.aulafragments

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnCadastro:Button
    private lateinit var btnLogin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnCadastro = findViewById(R.id.btnCadastro)
        btnLogin = findViewById(R.id.btnLogin)

        btnCadastro.setOnClickListener{
            val cadastroFragment = CadastroFragment()

            val bundle = bundleOf(
                "nomeAluno" to "Fabiola",
                "numFaltas" to 5
            )
            cadastroFragment.arguments = bundle

            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,cadastroFragment)
                .commit()
        }

        btnLogin.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,LoginFragment())
                .commit()
        }




    }
}