package com.example.calculesuaviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.calculesuaviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.butttonCalculate.setOnClickListener(this)
    }

    override fun onClick(view: View){
        if (view.id == R.id.buttton_calculate){
            calculate()
        }
    }

    private fun calculate(){
        val distance = binding.editDistance.text.toString().toFloat()
        val price = binding.editPrice.text.toString().toFloat()
        val autonomy = binding.editAutonomy.text.toString().toFloat()

        val totalValue = (distance * price) / autonomy
        binding.textTotalValue.text = "R$ ${"%.2f".format(totalValue)}"


        //Toast.makeText(this,totalValueStr, Toast.LENGTH_SHORT).show()
    }
}