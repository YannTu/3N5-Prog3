package ca.cem.tapelelapin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ca.cem.tapelelapin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private lateinit var listeBoutons : List<Button>

    var scoreTops = 0
    var scoreFlops = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.tvTops.setOnClickListener(View.OnClickListener{
            println("Coucou")
            binding.tvTops.setText("LAPIN")
        })
        listeBoutons = listOf(
            binding.btn1,
            binding.btn2,
            binding.btn3,
            binding.btn4,
            binding.btn5,
            binding.btn6,
            binding.btn7,
            binding.btn8,
            binding.btn9,
        )
        for (btn in listeBoutons) {
            btn.setOnClickListener(View.OnClickListener {
                reagirAuClic(it, btn)
            })
        }
        initialiser()
    }

    fun initialiser() {
        for (btn in listeBoutons) {
            btn.setText("TAUPE")
        }
        val boutonLapin : Button = listeBoutons.random()
        boutonLapin.setText("LAPIN")
    }

    fun reagirAuClic(it: View, btn: Button) {
        val boutonClique : Button = it as Button
        if (boutonClique.text == "LAPIN") {
            boutonClique.setText("TAUPE")
            Toast.makeText(this, "POOF", Toast.LENGTH_SHORT).show()
            initialiser()
            scoreTops++
        } else {
            scoreFlops++
        }
        binding.tvTops.setText("$scoreTops pafs")
        binding.tvFlops.setText("$scoreFlops flops")

    }
}