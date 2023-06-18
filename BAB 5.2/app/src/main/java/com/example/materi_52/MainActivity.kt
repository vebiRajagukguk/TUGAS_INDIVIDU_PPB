package com.example.materi_52

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    private lateinit var addButton: Button // Tombol "Add Card "
    private lateinit var cardContainer: LinearLayout // Container untuk kartu-kartu

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi tombol "tambah kartu"
        addButton = findViewById(R.id.addButton)

        // Inisialisasi container kartu
        cardContainer = findViewById(R.id.cardContainer)

        // Tambahkan kartu baru ketika tombol "Tambah Kartu" ditekan
        addButton.setOnClickListener {
            tambahKartu()
        }
    }

    private fun tambahKartu() {
        // Membuat tampilan new card  dari file layout card_layout.xml
        val cardView = LayoutInflater.from(this).inflate(R.layout.card_layout, null) as CardView

        // TextView untuk judul card
        val titleTextView = cardView.findViewById<TextView>(R.id.titleTextView)

        // TextView untuk deskripsi card
        val descriptionTextView = cardView.findViewById<TextView>(R.id.descriptionTextView)

        // Mengatur judul kartu
        titleTextView.text = "What is Card?"

        // Mengatur deskripsi kartu
        descriptionTextView.text = "A card is a flat, rectangular piece of material, typically made of paper or plastic, that is used for various purposes. Cards are often used for identification, communication, payment, or entertainment."

        // Mengatur warna latar belakang random card \
        cardView.setCardBackgroundColor(getRandomColor())

        // add card  ke dalam container
        cardContainer.addView(cardView)
    }

    private fun getRandomColor(): Int {
        // Array warna yang tersedia
        val colors = arrayOf(
            Color.YELLOW,
            Color.GRAY,
            Color.BLUE,
            Color.BLACK,
            Color.WHITE,
            Color.MAGENTA
        )
        // Memilih indeks warna secara acak
        val randomIndex = (0 until colors.size).random()

        // Mengembalikan warna yang dipilih secara acak
        return colors[randomIndex]
    }
}
