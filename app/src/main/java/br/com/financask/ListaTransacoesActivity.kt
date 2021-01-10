package br.com.financask

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_lista_transacoes.*

class ListaTransacoesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes = listOf("Comida - R$ 20,50", "Economia - R4 100,00")
        val arrayAdapter =
            ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, transacoes)

        lista_transacoes_listview.adapter = arrayAdapter
    }
}