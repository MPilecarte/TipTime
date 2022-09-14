package com.ds2.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ds2.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        binding.calculateButton.setOnClickListener { calculateTip() }
        setContentView(binding.root)

//        val costOfService = binding.inputEntradaGorjeta
//        costOfService.text = "Hi, ?".toString()
//
//        binding.inputEntradaGorjeta.text = "vixe, mudou!".toString()
    }

    fun calculateTip()
    {
        val stringInEdit = binding.costOfService.toString()
        val cost = stringInEdit.toDouble()

        val selectId = binding.tipOptions.checkedRadioButtonId

        val tipPercentage = when (selectId)
        {
            R.id.optionTwentyPercent -> 0.20
            R.id.optionEighteenPercent -> 0.18
            else -> 0.15
        }

        var tip = tipPercentage * cost

        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = formattedTip


        /*if (radioButon1)
        {
            val porcentagem = 0.2
        }
        if (radioButon1)
        {
            val porcentagem = 0.18
        }
        if (radioButon1)
        {
            val porcentagem = 0.15
        }

        var resultado = valorDaTextBox * porcentagem

        var tipTotal = binding.tipTotal.*/
    }
}