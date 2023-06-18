package com.example.implementasi_minggu8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // EditText
        val editText = findViewById<EditText>(R.id.editText)
        val textButton = findViewById<Button>(R.id.textButton)
        textButton.setOnClickListener {
            val inputText = editText.text.toString()
            Toast.makeText(this, "Input Text: $inputText", Toast.LENGTH_SHORT).show()
        }

        // CheckBox

        val checkBoxGroup= findViewById<CheckBox>(R.id.checkBox1
        val checkBox = findViewById<Button>(R.id.checkBox1)
        checkBoxGroup.setOnClickListener {
            val isChecked = checkBox.isChecked
            val resultText = if (isChecked) "checked" else "unchecked"
            Toast.makeText(this, "Checkbox is $resultText", Toast.LENGTH_SHORT).show()
        }

        // RadioButtons
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val radioButtonA = findViewById<RadioButton>(R.id.radioButtonA)
        val radioButtonB = findViewById<RadioButton>(R.id.radioButton2)
        val radioButtonC = findViewById<RadioButton>(R.id.radioButton3)



        val radioButtonsButton = findViewById<Button>(R.id.radioButtonsButton)
        radioButtonsButton.setOnClickListener {
            val selectedRadioButtonId = radioGroup.checkedRadioButtonId
            val selectedRadioButton = findViewById<RadioButton>(selectedRadioButtonId)
            val selectedText = selectedRadioButton.text.toString()
            Toast.makeText(this, "Selected radio button: $selectedText", Toast.LENGTH_SHORT).show()
        }

        // Spinner
        val spinner = findViewById<Spinner>(R.id.spinner)
        val spinnerButton = findViewById<Button>(R.id.spinnerButton)
        val spinnerValues = arrayOf("Value A", "Value B", "Value C", "Value D", "Value E", "ValueF")
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinnerValues)
        spinner.adapter = spinnerAdapter
        spinnerButton.setOnClickListener {
            val selectedValue = spinner.selectedItem.toString()
            Toast.makeText(this, "Selected spinner value: $selectedValue", Toast.LENGTH_SHORT).show()
        }
    }
}