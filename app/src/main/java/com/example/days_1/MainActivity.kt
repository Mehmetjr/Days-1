package com.example.days_1

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.days_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var btnGoToSettings : Button
    lateinit var txtData: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGoToSettings = findViewById(R.id.btnGoToSettings)
        txtData = findViewById(R.id.txtData)

        btnGoToSettings.setOnClickListener {
            var data = txtData.text.toString()
            if (data == ""){Toast.makeText(this,"Ekrana birşey yazmadınız",Toast.LENGTH_LONG).show()}
            else{Toast.makeText(this,data,Toast.LENGTH_LONG).show()}

        }


    }


}