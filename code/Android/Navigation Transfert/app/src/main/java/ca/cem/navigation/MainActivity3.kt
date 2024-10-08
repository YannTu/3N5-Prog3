package ca.cem.navigation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ca.cem.navigation.databinding.ActivityMain3Binding
import ca.cem.navigation.databinding.ActivityMainBinding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding : ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        title = "Contact"
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val bouton1Clique : Button = binding.btnAccueil3 as Button
        bouton1Clique.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Nom", binding.contactInputEditText.text.toString())
            startActivity(Intent(intent))
        }
    }
}