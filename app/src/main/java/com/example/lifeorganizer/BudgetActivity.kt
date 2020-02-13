package com.example.lifeorganizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.lifeorganizer.databinding.ActivityBudgetBinding
import com.example.lifeorganizer.databinding.ActivitySaldoBinding
import com.example.lifeorganizer.viewModel.BudgetViewModel
import com.example.lifeorganizer.viewModel.SaldoViewModel
import kotlinx.android.synthetic.main.activity_budget.*


import org.jetbrains.anko.startActivity

class BudgetActivity : AppCompatActivity() {


    private lateinit var budgetViewModel: BudgetViewModel


    private val binding: ActivityBudgetBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_budget) as ActivityBudgetBinding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_budget)
        btn_saldo.setOnClickListener { startActivity<SaldoActivity>() }

        budgetViewModel = ViewModelProvider
            .AndroidViewModelFactory
            .getInstance(application)
            .create(BudgetViewModel::class.java)


        binding.budget= budgetViewModel




        ArrayAdapter.createFromResource(
            this,
            R.array.categorias,
            android.R.layout.simple_spinner_item
        ).also{ adapter->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            catSelect.adapter = adapter
        }

         catSelect.onItemSelectedListener.toString()


    }






}
