package br.com.businesscard.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import br.com.businesscard.databinding.ActivityAddBusinessCardBinding

internal class AddBusinessCardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddBusinessCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBusinessCardBinding.inflate(LayoutInflater.from(this))
        val view = binding.root
        setContentView(view)
        insertListeners()
    }

    private fun insertListeners() {
        binding.btnClose.setOnClickListener{
            finish()
        }

        binding.btnConfirmar.setOnClickListener {  }
    }


}