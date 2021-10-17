package com.example.appsobremin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.appsobremin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val meuNome: MeuNome = MeuNome("victor Carreira")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.meuNome = meuNome
        binding.feitoButton.setOnClickListener {
            adicionaNome(it)
        }
    }
    private fun adicionaNome(view: View){

        binding.apply {
            //nickNameTexto.text = binding.nickName.text
            meuNome?.nickName = nickNameTexto.text.toString()
            invalidateAll()
            nickName.visibility = View.GONE
            feitoButton.visibility = View.GONE
            nickNameTexto.visibility = View.VISIBLE
        }
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)
    }
}

/*###############################################################################*/
/*
                                código usando o DataBinding
 */
/*###############################################################################*/
//variável que servirá como objeto de ligação e será instanciado em onCreate - binding
//criada uma instância da classe MeuNome
//o tipo de ligação será a clasee ActivityMainBinding
// aqui será instanciado o objeto de ligação entre o layout e a view - binding = DataBindingUtil.setContentView
// aqui a variavel meuNome recebe um valor
// define o onClicklistener para o botão
// nesse contexto, it se refere-se ao objeto botão feito.

//função para receber o texto digitado e apresentar depois - adicionaNome
//view e o meu contexto

// é criada uma variável automaticamente para apresentar a visualização do texto digitado - nicknametexto
// é criada tbm outra variável que recebe o texto - nickname
// a variável de visualização recebe o texto digitado
// invalida todas as expressões de ligação para que sejam recriadas com os dados corretos, atualizando a UI - invalidateAll()
// mudanças de visibilidade - gome oculta as variáveis que representam views
// torna a visualização do texto possivel - lembrando que no layout foi colocada como GONE

// oculta o teclado após a digitação(clicado no botão done) - vaiável val=imm

/*#######################################################################*/
/*                       código anterior ao DataBinding                 */
/*#######################################################################*/
// class MainActivity : AppCompatActivity() {
//
// override fun onCreate(savedInstanceState: Bundle?) {
// super.onCreate(savedInstanceState)
// setContentView(R.layout.activity_main)
//
// # define o onClicklistener para o botão
//
// /*        findViewById<Button>(R.id.feito_button).setOnClickListener {
// adicionaNome(it)
// nessecontexto, it se refere-se ao objeto botão feito.
// }
//
// binding.feitoButton.setOnClickListener {
// adicionaNome(it)
// }
// # nessecontexto, it se refere-se ao objeto botão feito.
// }
// #função para receber o texto digitado e apresentar depois
// #view e o meu contexto
// private fun adicionaNome(view: View){
// #variavel recebe o texto
// val editText:EditText = findViewById(R.id.nick_name)
// #variável que vai apresentar o texto
// val nicknameTextView:TextView = findViewById(R.id.nick_name_texto)
// # a variável de visualização recebe o texto digitado
// nicknameTextView.text = editText.text
// # mudançãs de visibilidade - gome oculta as variáveis que representam views
// editText.visibility = View.GONE
// view.visibility = View.GONE
// # torna a visualização do texto possivel - lembrando que no layout foi colocada como GONE
// nicknameTextView.visibility = View.VISIBLE
//
// #oculta o teclado após a digitação(clicado no botão done)
// val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
// imm.hideSoftInputFromWindow(view.windowToken,0)
// }
// }
// */