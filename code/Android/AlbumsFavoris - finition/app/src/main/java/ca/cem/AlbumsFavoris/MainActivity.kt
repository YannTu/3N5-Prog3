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
import com.squareup.picasso.Picasso

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
        binding.rvMonAdapter.addItemDecoration(
            DividerItemDecoration(
                binding.rvMonAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecycler() {
        val items: MutableList<Album> = mutableListOf(Album(0, "Antigéographiquement", "Jérôme 50", "https://f4.bcbits.com/img/a0037529108_10.jpg"), Album(1, "J'ai Bu", "Québec Redneck Bluegrass Project", "https://f4.bcbits.com/img/a2620243101_16.jpg"), Album(2, "Comment Debord", "Comment Debord", "https://i.scdn.co/image/ab67616d0000b273115830b5e79d093c92492b10"), Album(3, "Darlène", "Hubert Lenoir", "https://i.scdn.co/image/ab67616d0000b2734ee8d921b4268479455edcaf"), Album(4, "La Nuit Est Une Panthère", "Les Louanges", "https://bonsound-cdn.com/image/1/1002/0/uploads/releases/louanges-panthe-re-final5juinweb-1528230465.jpg"), Album(4, "Jaune", "Jean-Pierre Ferland", "https://images.archambault.ca/images/PG/1008/1008280-gf.jpg?404=default"))
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}