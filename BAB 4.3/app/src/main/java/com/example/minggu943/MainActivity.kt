package com.example.minggu943

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvSelectedOption: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvSelectedOption = findViewById(R.id.tvSelectedOption)

        val btnShowPicker: Button = findViewById(R.id.btnShowPicker)
        btnShowPicker.setOnClickListener {
            showPicker()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_itemA -> {
                tvSelectedOption.text = "Selected Option: Option A"
                return true
            }
            R.id.menu_itemB -> {
                tvSelectedOption.text = "Selected Option: Option B"
                return true
            }
            R.id.menu_itemC -> {
                tvSelectedOption.text = "Selected Option: Option C"
                return true
            }
            R.id.menu_itemD -> {
                tvSelectedOption.text = "Selected Option: Option D"
                return true
            }
            R.id.menu_itemE -> {
                tvSelectedOption.text = "Selected Option: Option E"
                return true
            }
            R.id.menu_itemF -> {
                tvSelectedOption.text = "Selected Option: Option F"
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    private fun showMenu() {
        openOptionsMenu()
    }

    private fun showPicker() {
        val pickerOptions = arrayOf("Option A", "Option B", "Option C", "Option D", "Option E", "Option F")

        val builder = androidx.appcompat.app.AlertDialog.Builder(this)
        builder.setTitle("Select an option")

        builder.setItems(pickerOptions) { _, which ->
            tvSelectedOption.text = "Selected Option: ${pickerOptions[which]}"
        }

        builder.create().show()
    }
}