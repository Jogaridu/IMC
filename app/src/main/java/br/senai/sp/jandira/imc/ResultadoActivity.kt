package br.senai.sp.jandira.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var peso = intent.getStringExtra("peso")

        Toast.makeText(this, "E sou Toast, e peso " + peso + " quilos", Toast.LENGTH_LONG).show()

    }
}
