package com.example.projeto_teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonRoll = findViewById<Button>(R.id.roll_button)
        buttonRoll.text = "Role o botão" //  posso alterar dinamicamente o texto exibido desta forma.
        buttonRoll.setOnClickListener {
            rolarDados()
        }
    }

        private fun rolarDados() {
            val randomInt = Random().nextInt(6) + 1
            val resultTextView: TextView = findViewById(R.id.resultado_texto)
            resultTextView.text = randomInt.toString()
        }
    }


/*######################################################################*/
//modificar o textview quando o botão for precionado
//criada a função rolarDados que vai abriagar a lógica do envio de dados
//obter um número aleatório entre 6 e 1
//obter a referência para textView usando o id
//definir a variável aleatória para o texto de TextView
//altero dinamicamente usando o .text e converto para string o inteiro gerado aleatoriamente
/*########################################################################*/

/*##########################################################################*/
//realizando uma interação ao clicar no botão chamando o setOnClickListner - ouvir o click, usa um lambda
//usar o Toast para exibir uma notificação - toast.mak chama o toast
//.show exibe realmente a notificação

/*        buttonRoll.setOnClickListener{
/*            Toast.makeText(this,"interação sucesso",Toast.LENGTH_SHORT).show()
/*        }*/
/*    }
}

#############################################################################*/