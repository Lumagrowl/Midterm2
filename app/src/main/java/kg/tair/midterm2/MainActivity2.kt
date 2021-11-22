package kg.tair.midterm2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val home = findViewById<Button>(R.id.button)

        home.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}