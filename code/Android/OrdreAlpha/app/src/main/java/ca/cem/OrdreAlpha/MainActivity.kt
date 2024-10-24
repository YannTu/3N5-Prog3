package ca.cem.OrdreAlpha

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import ca.cem.OrdreAlpha.adapters.MonAdapter
import ca.cem.OrdreAlpha.databinding.ActivityMainBinding

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
        adapter = MonAdapter(this)
        binding.rvMonAdapter.adapter = adapter
        binding.rvMonAdapter.setHasFixedSize(true)
        binding.rvMonAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvMonAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecycler() {
        val items: MutableList<String> = mutableListOf("Alexis", "Edouard", "Simon", "Téo")
        //mélanger liste jusqu'à ce qu'elle ne soit pas en ordre alphabétique
        while (items.sorted() == items) {
            items.shuffle()
        }
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}