package ca.cem.AlbumsFavoris.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ca.cem.AlbumsFavoris.databinding.MonItemBinding
import ca.cem.AlbumsFavoris.models.Bingo

class MonAdapter : ListAdapter<Bingo, MonAdapter.MonItemViewHolder>(MonItemDiffCallback) {
    inner class MonItemViewHolder(private val binding: MonItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(bingo: Bingo) {
            binding.tirage.text = "Tirage #${bingo.tirage}"
            binding.numero.text = "Numéro tiré : ${bingo.numero}"
            binding.lettre.text = bingo.lettre.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonItemViewHolder {
        val binding: MonItemBinding = MonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MonItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MonItemViewHolder, position: Int) {
        val item: Bingo = getItem(position)
        holder.bind(item)
    }
}

object MonItemDiffCallback : DiffUtil.ItemCallback<Bingo>() {
    override fun areItemsTheSame(oldItem: Bingo, newItem: Bingo): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Bingo, newItem: Bingo): Boolean {
        return oldItem.tirage == newItem.tirage &&
                oldItem.numero == newItem.numero &&
                oldItem.lettre == newItem.lettre
    }
}