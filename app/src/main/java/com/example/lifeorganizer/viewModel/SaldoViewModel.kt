package com.example.lifeorganizer.viewModel

import androidx.lifecycle.ViewModel
import androidx.databinding.ObservableField


class SaldoViewModel : ViewModel() {

    val wants = ObservableField<String>()
    val needs = ObservableField<String>()
    val savings = ObservableField<String>()

    init{
        wants.set(0.0F.toString())
        needs.set(0.0F.toString())
        savings.set(0.0F.toString())


    }


}