package com.example.imadassignment

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//viewCompact
        //Code goes here
        //Declarations

        val tvTitle = findViewById<TextView>(R.id.tvTitle)
        val edtTimeOfDay =findViewById<EditText>(R.id.edtTimeOfDay)
        val btnEnter = findViewById<Button>(R.id.btnEnter)
        val btnReset = findViewById<Button>(R.id.btnReset)

        var timeofday: String
        var Morning: String
        var Midmorning: String
        var Afternoon: String
        var Afternoonsnack: String
        var Dinner: String
        var Night: String

        btnEnter.setOnClickListener {
            timeofday = edtTimeOfDay.text.toString()
            Morning = edtTimeOfDay.text.toString()
            Midmorning = edtTimeOfDay.text.toString()
            Afternoon = edtTimeOfDay.text.toString()
            Afternoonsnack = edtTimeOfDay.text.toString()
            Dinner = edtTimeOfDay.text.toString()
            Night = edtTimeOfDay.text.toString()

            //check time of day
            if (timeofday == "Morning")
                tvTitle.text="Send a Good Morning text to family member"

            else if (timeofday == "Midmorning")
                tvTitle.text="Reach out to a colleague with a quick 'Thank you'"

            else if (timeofday == "Afternoon")
                tvTitle.text="Share a funny meme or interesting link with a friend"

            else if (timeofday == "Afternoon snack")
                tvTitle.text="Send a quick 'thinking of you' message"

            else if (timeofday =="Dinner")
                tvTitle.text="Call a friend for a 5 minute catch up"

            else if (timeofday =="Night")
                tvTitle.text="Leave a thoughtful comment on a friends post"

            else{

                Toast.makeText(
                    this,"please enter valid information",
                    Toast.LENGTH_SHORT
                ).show()


            }


        }
        //clear all input
        btnReset.setOnClickListener {
            tvTitle.text="Social Sparks"
            edtTimeOfDay.text.clear()
        }

    }
}
