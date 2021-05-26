package com.example.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // DEC variáveis
            // val -> não muda (constante)
            // var -> varía (variável)
        var contador : Int = 10;
        contador = 23;

        val contador2 : Int = 1;
        // contador2 = 3; // Não compila

        // Segurança nula
        val languageName : String? = null;

        // Condicionais
        val idade : Int = 20;
        /*
        val maioridade : String = if (idade > 18) {
            "Você é maior de idade";
        } else {
            "Você é menor de idade";
        }
        */

        // when
        val minhaIdade = when {
            idade > 18 -> "Você é maior de idade"
            else -> "Você é menor de idade"
        }

        // Funções
        fun minhaIdade() :String = "Minha idade é 18"

        minhaIdade();

        // Instanciando uma classe
        val medicamento = Medicamento("teste 1", "2 vezes ao dia");
        medicamento.formula
    }
}