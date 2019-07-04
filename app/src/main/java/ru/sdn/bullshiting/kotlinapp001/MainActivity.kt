package ru.sdn.bullshiting.kotlinapp001

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    val EXTRA_MESSAGE = "extra_message"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View){
        val etSend = findViewById<EditText>(R.id.etSend)
        val message = etSend.text.toString()
        val intent = Intent(this,SendMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE,message)
        }
        startActivity(intent)
    }
}
