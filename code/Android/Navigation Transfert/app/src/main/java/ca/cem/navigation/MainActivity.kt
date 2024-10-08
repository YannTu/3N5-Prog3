package ca.cem.navigation

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ca.cem.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        title = "Accueil"
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val bouton1Clique : Button = binding.btnArticle1 as Button
        bouton1Clique.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("numéro", binding.picker.value)
            startActivity(intent)
        }

        val bouton2Clique : Button = binding.btnContact1 as Button
        bouton2Clique.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }

        binding.picker.maxValue=10
        binding.picker.minValue=0

    }
}