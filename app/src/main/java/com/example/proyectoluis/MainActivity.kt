package com.example.proyectoluis

import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var compareButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        compareButton = findViewById(R.id.compareButton)
        resultTextView = findViewById(R.id.resultTextView)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]


        compareButton.setOnClickListener {
            val result = if (viewModel.text1 == viewModel.text2) "Son iguales" else "No son iguales"
            "$result".also { resultTextView.text = it }
        }

        editText1.addTextChangedListener {
            viewModel.text1 = it.toString()
        }

        editText2.addTextChangedListener {
            viewModel.text2 = it.toString()
        }
    }
}