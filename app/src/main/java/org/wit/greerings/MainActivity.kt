package org.wit.greerings


import android.os.Bundle
import android.provider.Settings.Global.getString
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetingButton.setOnClickListener {
            val greetingText = getString(R.string.greeting_text)
            Toast.makeText(this, greetingText, Toast.LENGTH_LONG).show()
        }
    }
}
