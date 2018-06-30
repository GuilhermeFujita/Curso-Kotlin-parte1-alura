package fujita.guilherme.financask.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import fujita.guilherme.financask.R
import fujita.guilherme.financask.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes: List<String> = listOf("Comida - R$20,00 ", "Economia - R$100,00")

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, transacoes)

        //Seta o adapter na lista
        lista_transacoes_listview.setAdapter(ListaTransacoesAdapter(transacoes, this))
    }
}