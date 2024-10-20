package ca.cem.AlbumsFavoris

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import ca.cem.AlbumsFavoris.adapters.MonAdapter
import ca.cem.AlbumsFavoris.databinding.ActivityMainBinding
import ca.cem.AlbumsFavoris.models.Album

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
        val items: MutableList<Album> = mutableListOf(Album(0, "Antigéographiquement", "Jérôme 50"), Album(1, "J'ai Bu", "Québec Redneck Bluegrass Project"), Album(2, "Comment Debord", "Comment Debord"), Album(3, "Darlène", "Hubert Lenoir"), Album(4, "La Nuit Est Une Panthère", "Les Louanges"), Album(4, "Jaune", "Jean-Pierre Ferland"))
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}