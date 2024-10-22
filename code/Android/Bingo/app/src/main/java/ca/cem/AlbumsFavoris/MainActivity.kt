package ca.cem.AlbumsFavoris

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import ca.cem.AlbumsFavoris.adapters.MonAdapter
import ca.cem.AlbumsFavoris.databinding.ActivityMainBinding
import ca.cem.AlbumsFavoris.models.Bingo

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var adapter: MonAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
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
        binding.rvMonAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvMonAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecycler() {
        val items: MutableList<Bingo> = mutableListOf()
        //boucle de 75 fois qui créer un objet bingo  avec un numéro aléatoire entre 1 et 75 qui ne se répète pas et une lettre entre B pour 1-15, I pour 16-30, N pour 31-45, G pour 46-60 et O pour 61-75
        for (i in 1..75) {
            var numero = (1..75).random()
            while (items.any { it.numero == numero }) {
                numero = (1..75).random()
            }
            val lettre = when (numero) {
                in 1..15 -> 'B'
                in 16..30 -> 'I'
                in 31..45 -> 'N'
                in 46..60 -> 'G'
                else -> 'O'
            }
            items.add(Bingo(i, numero, lettre))
        }
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}