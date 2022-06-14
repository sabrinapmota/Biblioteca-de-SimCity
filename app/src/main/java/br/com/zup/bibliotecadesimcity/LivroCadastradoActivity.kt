package br.com.zup.bibliotecadesimcity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.bibliotecadesimcity.databinding.ActivityLivroCadastradoBinding
import br.com.zup.bibliotecadesimcity.databinding.ActivityMainBinding

class LivroCadastradoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLivroCadastradoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
binding=ActivityLivroCadastradoBinding.inflate(
    layoutInflater
)
        setContentView(R.layout.activity_livro_cadastrado)
    }
}