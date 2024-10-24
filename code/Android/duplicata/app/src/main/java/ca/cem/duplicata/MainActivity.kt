package ca.cem.duplicata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import ca.cem.duplicata.adapters.MonAdapter
import ca.cem.duplicata.databinding.ActivityMainBinding

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
        binding.rvMonAdapter.addItemDecoration(
            DividerItemDecoration(
                binding.rvMonAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecycler() {
        val items: MutableList<String> = mutableListOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
        adapter.submitList(items)
    }
}