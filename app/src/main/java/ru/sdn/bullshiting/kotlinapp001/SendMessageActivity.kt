package ru.sdn.bullshiting.kotlinapp001

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SendMessageActivity : AppCompatActivity() {

    val EXTRA_MESSAGE = "extra_message"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_message)

        val get_message = intent.getStringExtra(EXTRA_MESSAGE)

        val tvRecived = findViewById<TextView>(R.id.tvRecived).apply {
            text = get_message
        }
    }
}
