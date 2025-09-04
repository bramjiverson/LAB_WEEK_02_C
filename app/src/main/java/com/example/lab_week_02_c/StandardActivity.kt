package com.example.lab_week_02_c

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class StandardActivity : AppCompatActivity() {
    companion object {
        private const val DEBUG = "DEBUG"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // opsional, bisa dihapus kalau tidak dipakai
        setContentView(R.layout.activity_standard)

        Log.d(DEBUG, "onCreate")

        // Pastikan di activity_standard.xml ada Button dengan id @+id/button_standard
        findViewById<Button>(R.id.button_standard).setOnClickListener {
            startActivity(
                Intent(this, StandardActivity::class.java)
            )
        }
    }

    override fun onNewIntent(intent: Intent) { // ✅ pakai non-null Intent
        super.onNewIntent(intent)
        Log.d(DEBUG, "onNewIntent: $intent")
    }
}
