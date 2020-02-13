package com.example.lifeorganizer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.lifeorganizer.databinding.ActivitySaldoBinding
import com.example.lifeorganizer.viewModel.SaldoViewModel


class SaldoActivity :AppCompatActivity(){

    private lateinit var saldoViewModel: SaldoViewModel

    private val binding: ActivitySaldoBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_saldo) as ActivitySaldoBinding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saldo)

        saldoViewModel = ViewModelProvider
            .AndroidViewModelFactory
            .getInstance(application)
            .create(SaldoViewModel::class.java)


        binding.saldos = saldoViewModel

    }


}