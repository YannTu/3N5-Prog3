package ca.cem.AlbumsFavoris

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import ca.cem.AlbumsFavoris.adapters.MonAdapter
import ca.cem.AlbumsFavoris.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var adapter: MonAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        title = "Accueil"
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupRecycler()
        fillRecycler()
    }

    private fun setupRecycler() {
        adapter = MonAdapter()
        binding.rvMonAdapter.adapter = adapter
        binding.rvMonAdapter.setHasFixedSize(true)
    }

    private fun fillRecycler() {
        val items: MutableList<String> = mutableListOf("Antigéographiquement", "J'ai Bu", "Comment Debord", "Darlène", "La Nuit Est Une Panthère", "Jaune")
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}