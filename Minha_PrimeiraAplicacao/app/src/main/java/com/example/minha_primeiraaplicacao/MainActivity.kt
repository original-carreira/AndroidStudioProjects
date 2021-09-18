package com.example.minha_primeiraaplicacao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.minha.primeiraaplicacao.MESSAGE"

//outro forma -livro dominando o android
/*class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edtTexto = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val texto = edtTexto.text.toString()
            Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
        }

    }
}*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
/**Chamado quando o usuário toca no botão Enviar*/
    fun sendMessage(view: View){
        val editText = findViewById<EditText>(R.id.editText_Nome)
        val message = editText.text.toString()
        val intent = Intent(this,DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE,message)
        }
    startActivity(intent)
    }
}