package ca.cem.AlbumsFavoris.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ca.cem.AlbumsFavoris.SecondActivity
import ca.cem.AlbumsFavoris.databinding.MonItemBinding
import ca.cem.AlbumsFavoris.models.Album

class MonAdapter : ListAdapter<Album, MonAdapter.MonItemViewHolder>(MonItemDiffCallback) {
    inner class MonItemViewHolder(private val binding: MonItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(album: Album) {
            binding.tvAlbum.text = album.name
            binding.tvArtiste.text = album.artistName
            binding.tvElement.setOnClickListener {
                val intent: Intent = Intent(binding.root.context, SecondActivity::class.java)
                intent.putExtra("albumNom", album.name)
                intent.putExtra("artisteNom", album.artistName)
                binding.root.context.startActivity(intent)
            }
            binding.btn.setOnClickListener {
                val items: MutableList<Album> = currentList.toMutableList()
                items.remove(album)
                submitList(items)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonItemViewHolder {
        val binding: MonItemBinding = MonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MonItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MonItemViewHolder, position: Int) {
        val item: Album = getItem(position)
        holder.bind(item)
    }
}

object MonItemDiffCallback : DiffUtil.ItemCallback<Album>() {
    override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem.name == newItem.name &&
                oldItem.artistName == newItem.artistName
    }
}