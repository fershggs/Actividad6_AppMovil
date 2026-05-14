package com.example.actividad6
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.actividad6.databinding.ItemListaBinding

class NoticiaAdapter (val noticias: List<Noticia>):
        RecyclerView.Adapter<NoticiaHolder>() {
        override fun onCreateViewHolder(
                parent: ViewGroup,
                viewType: Int
        ): NoticiaHolder {
                val inflater = LayoutInflater.from(parent.context)
                val binding = ItemListaBinding.inflate(inflater, parent, false)
                return NoticiaHolder(binding)
        }

        override fun onBindViewHolder(
                holder: NoticiaHolder,
                position: Int
        ) {
                val noticia = noticias[position]
                holder.binding.tvwTitle.text = noticia.title
                holder.binding.tvwDescription.text = noticia.description

                TODO("Not yet implemented")
        }

        override fun getItemCount(): Int {
                TODO("Not yet implemented")
        }
}