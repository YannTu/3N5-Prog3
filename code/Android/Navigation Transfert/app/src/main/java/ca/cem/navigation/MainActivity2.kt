package ca.cem.navigation

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ca.cem.navigation.databinding.ActivityMain2Binding
import ca.cem.navigation.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding : ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        val numéro = intent.getIntExtra("numéro", 0)
        title = "Article #${numéro}"
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        val bouton1Clique : Button = binding.btnContact2 as Button
        bouton1Clique.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }

}