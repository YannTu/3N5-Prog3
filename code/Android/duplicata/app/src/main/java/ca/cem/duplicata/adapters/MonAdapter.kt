package ca.cem.duplicata.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ca.cem.duplicata.MainActivity
import ca.cem.duplicata.databinding.MonItemBinding

class MonAdapter(private val activity: MainActivity) : ListAdapter<String, MonAdapter.MonItemViewHolder>(MonItemDiffCallback) {
    inner class MonItemViewHolder(private val binding: MonItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String) {
            binding.nombre.text = item
            binding.btn.setOnClickListener{
                //dédouble l'item de la liste
                val position = adapterPosition
                val item = currentList[position]
                val newList = currentList.toMutableList()
                newList.add(position + 1, item)
                submitList(newList)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonItemViewHolder {
        val binding: MonItemBinding = MonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MonItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MonItemViewHolder, position: Int) {
        val item: String = getItem(position)
        holder.bind(item)
    }
}

object MonItemDiffCallback : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}