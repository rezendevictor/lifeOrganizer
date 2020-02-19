package com.example.lifeorganizer.viewModel

import android.app.Application
import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.Observable
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.lifeorganizer.R
import com.example.lifeorganizer.SaldoActivity
import org.jetbrains.anko.startActivity
import java.util.*

class BudgetViewModel(application: Application):AndroidViewModel(application) {


    var valor = ObservableField<String>()
    val spinner = ObservableField<String>()
    val context = application.applicationContext



    fun addMoney(){


        if(this.spinner.get() == "NEEDS"){
            Toast.makeText(context,"NEEDS " + (valor.get()?.toInt()),Toast.LENGTH_LONG).show()

        }else {
            if(this.spinner.get() == "WANTS"){

                Toast.makeText(context,"WANTS " + valor.get(),Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(context,"SAVINGS " + valor.get(),Toast.LENGTH_LONG).show()
            }
        }



    }




}