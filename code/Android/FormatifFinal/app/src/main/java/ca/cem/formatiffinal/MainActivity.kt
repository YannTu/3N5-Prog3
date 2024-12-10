package ca.cem.formatiffinal

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import ca.cem.formatiffinal.adapters.MonAdapter
import ca.cem.formatiffinal.databinding.ActivityMainBinding
import ca.cem.formatiffinal.models.Item

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var adapter: MonAdapter // L'adapteur est accessible partout dans notre classe

    override fun onCreate(savedInstanceState: Bundle?) {
        title = "Versions"
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        val view = binding.root
        setContentView(view)

        setupRecycler()
        fillRecycler()
    }

    private fun setupRecycler() {
        adapter = MonAdapter() // Créer l'adapteur
        binding.rvMonAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvMonAdapter.setHasFixedSize(true) // Option pour améliorer les performances
    }

    private fun fillRecycler() {
        val items: MutableList<Item> = mutableListOf(Item("1.1", "Petit Four"), Item("1.5", "Cupcake"), Item("2.0", "Eclair."), Item("3.0", "Honeycomb"), Item("4.0", "Ice cream sandwich"), Item("5.0", "Lollipop"))
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}