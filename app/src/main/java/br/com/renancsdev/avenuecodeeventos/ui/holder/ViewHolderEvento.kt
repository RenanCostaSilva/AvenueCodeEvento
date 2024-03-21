package br.com.renancsdev.avenuecodeeventos.ui.holder

import androidx.recyclerview.widget.RecyclerView
import br.com.renancsdev.avenuecodeeventos.databinding.ItemRecyclerEventoBinding
import br.com.renancsdev.avenuecodeeventos.extension.mostrar
import br.com.renancsdev.avenuecodeeventos.extension.redDetalheComID
import br.com.renancsdev.avenuecodeeventos.model.Evento
import br.com.renancsdev.avenuecodeeventos.util.imagem.GlideImagem

class ViewHolderEvento(private var binding: ItemRecyclerEventoBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(evento: Evento) {
        exibirDados(evento)
        redirecionarDetalheComID(evento.id)
    }

    private fun exibirDados(evento: Evento){
        GlideImagem().show(binding.root.context , evento.image , binding.imgItemEventoTitulo)
        binding.tvItemEventoTitulo.mostrar(evento.title)
        binding.tvItemEventoDescricao.mostrar(evento.description)
    }
    private fun redirecionarDetalheComID(id: Int){
        binding.cardEvento.setOnClickListener {
            binding.root.context.redDetalheComID(id)
        }
    }

}