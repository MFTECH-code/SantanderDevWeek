package com.example.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Chamando nosso layout
        val inflate = menuInflater
        inflate.inflate(R.menu.main_menu, menu)
        return true
    }

    // Escutando o item do menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Quando o item for apertado faça alguma ação
        return when (item.itemId) {
            R.id.item1 -> {
                Log.d("CLICK", "CLICK NO ITEM 1") // log no console
                true
            }
            R.id.item2 -> {
                Log.d("CLICK", "ITEM 2 SELECIONADO KKKKSJJJ")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}