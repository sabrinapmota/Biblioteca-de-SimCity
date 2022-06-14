package br.com.zup.bibliotecadesimcity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.bibliotecadesimcity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(
            layoutInflater
        )
        setContentView(binding.root)
        binding.btDisponivel.setOnClickListener {

            val titulo = binding.etTitulodoLivro.text.toString()
            val nomeAutor = binding.etNomedoAltor.text.toString()
            val quantidadePaginas = binding.etQuantPaginas.text.toString().toInt()
        }
        binding.btRetirado.setOnClickListener {
            val titulo = binding.etTitulodoLivro.text.toString()
            val nomeAutor = binding.etNomedoAltor.text.toString()
            val quantidadePaginas = binding.etQuantPaginas.text.toString().toInt()
        }
    }
}
