package com.example.private24currency

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.private24currency.databinding.ActivityMainBinding
import com.example.private24currency.retrofit.RetrofitPrivate24

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnLoadCurrency.setOnClickListener {
            retrofitPrivate24?.getDateExchange{
                Log.d(TAG, "onCreate: $it")


            }
        }
    }

    private var retrofitPrivate24: RetrofitPrivate24? = null
    override fun onStart() {
        super.onStart()

        retrofitPrivate24 = RetrofitPrivate24()
    }

    override fun onStop() {
        super.onStop()

        retrofitPrivate24 = null
    }

    val TAG = "XXXX"
}