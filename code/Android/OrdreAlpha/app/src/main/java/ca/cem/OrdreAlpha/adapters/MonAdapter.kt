package ca.cem.OrdreAlpha.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ca.cem.OrdreAlpha.MainActivity
import ca.cem.OrdreAlpha.databinding.MonItemBinding

class MonAdapter(private val activity: MainActivity) : ListAdapter<String, MonAdapter.MonItemViewHolder>(MonItemDiffCallback) {
    inner class MonItemViewHolder(private val binding: MonItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String) {
            binding.prenom.text = item // On affiche l'élément dans le TextView
            //btn1 qui fait monter le recycleView d'un élément lorsqu'on clique dessus quand on peut
            binding.btn1.setOnClickListener {
                if (adapterPosition > 0) {
                    val position = adapterPosition
                    val item = currentList[position]
                    val newList = currentList.toMutableList()
                    newList.removeAt(position)
                    newList.add(position - 1, item)
                    submitList(newList)
                    verifierOrdreAlphabetique(newList)
                }
            }
            //btn2 qui fait descendre le recycleView d'un élément lorsqu'on clique dessus quand on peut
            binding.btn2.setOnClickListener {
                if (adapterPosition < currentList.size - 1) {
                    val position = adapterPosition
                    val item = currentList[position]
                    val newList = currentList.toMutableList()
                    newList.removeAt(position)
                    newList.add(position + 1, item)
                    submitList(newList)
                    verifierOrdreAlphabetique(newList)
                }
            }
        }
    }

    private fun verifierOrdreAlphabetique(items: List<String>) {
        if (items == items.sorted()) {
            Toast.makeText(activity, "BRAVO!!! La liste est en ordre alphabétique.", Toast.LENGTH_SHORT).show()
            val handler = android.os.Handler()
            handler.postDelayed({
                val shuffledList = items.toMutableList()
                do {
                    shuffledList.shuffle()
                } while (shuffledList.sorted() == shuffledList)

                submitList(shuffledList) // Soumettre la liste mélangée à l'adaptateur
            }, 2000) // Soumettre la liste mélangée à l'adaptateur
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