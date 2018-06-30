package fujita.guilherme.financask.ui.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class ListaTransacoesAdapter(transacoes: List<String>) : BaseAdapter() {

    private val transacoes = transacoes;

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItem(posicao: Int): String {
        return transacoes[posicao]
    }

    override fun getItemId(position: Int): Long {
        return  0
    }

    override fun getCount(): Int {
        return transacoes.size
    }
}