package br.com.financask.ui.activity

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import br.com.financask.R
import br.com.financask.model.Tipo
import br.com.financask.model.Transacao
import br.com.financask.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal

class ListaTransacoesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes = listOf(
            Transacao(
                valor = BigDecimal(20.5),
                categoria = "comida",
                tipo = Tipo.DESPESA
            ),
            Transacao(
                valor = BigDecimal(100.0),
                categoria = "Economia",
                tipo = Tipo.RECEITA
            ),
            Transacao(
                valor = BigDecimal(200.0),
                tipo = Tipo.DESPESA
            ),
            Transacao(
                valor = BigDecimal(500.0),
                categoria = "Premio",
                tipo = Tipo.RECEITA
            )
        )
        val arrayAdapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, transacoes)

        lista_transacoes_listview.adapter =
            ListaTransacoesAdapter(transacoes, this)
    }
}