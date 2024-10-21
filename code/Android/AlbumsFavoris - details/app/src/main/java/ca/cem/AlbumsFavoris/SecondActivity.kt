package ca.cem.AlbumsFavoris

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ca.cem.AlbumsFavoris.adapters.MonAdapter
import ca.cem.AlbumsFavoris.databinding.ActivityMainBinding
import ca.cem.AlbumsFavoris.databinding.ActivitySecondBinding
import ca.cem.AlbumsFavoris.models.Album

class SecondActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySecondBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        title = "Détails"
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        binding.tvAlbum.text = intent.getStringExtra("albumNom")
        binding.tvArtiste.text = intent.getStringExtra("artisteNom")
        binding.main.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val view = binding.root
        setContentView(view)

    }
}