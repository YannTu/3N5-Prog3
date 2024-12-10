package ca.cem.formatiffinal

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ca.cem.formatiffinal.databinding.ActivityAutreBinding
import ca.cem.formatiffinal.databinding.ActivityMainBinding

class AutreActivity : AppCompatActivity()  {

    private lateinit var binding : ActivityAutreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        title = "Versions"
        super.onCreate(savedInstanceState)
        binding = ActivityAutreBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        val view = binding.root
        setContentView(view)

        if(intent.hasExtra("version") && intent.hasExtra("contenu")) {
            binding.tvElement.text = "Android " + intent.getStringExtra("version")
            binding.tvElement2.text = intent.getStringExtra("contenu")
        }
    }
}