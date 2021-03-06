package com.example.lancardados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

lateinit var imagemDado: ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttoAction = findViewById<Button>(R.id.action_button)
        buttoAction.setOnClickListener {
            rolarDados()
        }
        imagemDado = findViewById(R.id.ViewImagemDado)
    }

    private fun rolarDados() {
        val randomInt = java.util.Random().nextInt(6) + 1
        val imagemAleatoria = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imagemDado.setImageResource(imagemAleatoria)
    }
}
/*################################################################*/
//TextView foi substituida por uma ImagemView
//Foi adicionado na pasta drawable imagens no formato xml
//criada a função rolar dados com a logica de apresentar uma imgem quando o botão for clicado
//variável  criada para receber a alteração dinamica de imagem - usando uma expressão whem com um número aleatório definido em randomInt
//usando o setImagemResource() para alterar a imgem apresentada. É passado como parâmetro a variável imagemAleatoria
/*################################################################*/
//melhorei o codigo com boas práticas usando o lateinit
//retirei a linha da função rolarDados: val imagemDado = findViewById<ImageView>(R.id.ViewImagemDado) e a inicializei antes do onCreate como lateinit var imagemDado: ImageView
//refiz a asssossiação dentro do oncreate com o findViewById como imagemDado = findViewById(R.id.ViewImagemDado)
/*#################################################################*/
