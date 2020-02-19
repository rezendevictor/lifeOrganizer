package com.example.lifeorganizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.lifeorganizer.databinding.ActivityBudgetBinding
import com.example.lifeorganizer.viewModel.BudgetViewModel
import kotlinx.android.synthetic.main.activity_budget.*


import org.jetbrains.anko.startActivity
import kotlin.math.absoluteValue

class BudgetActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {


    private lateinit var budgetViewModel: BudgetViewModel


    private val binding: ActivityBudgetBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_budget) as ActivityBudgetBinding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_budget)


        budgetViewModel = ViewModelProvider
            .AndroidViewModelFactory
            .getInstance(application)
            .create(BudgetViewModel::class.java)


        binding.budget = budgetViewModel

        catSelect.onItemSelectedListener


        ArrayAdapter.createFromResource(
            this,
            R.array.categorias,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            catSelect.adapter = adapter
        }

        catSelect.onItemSelectedListener = this






    }


    override fun onNothingSelected(parent: AdapterView<*>?) {
    }


    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var array = resources.getStringArray(R.array.categorias)
        

        binding.budget?.spinner?.set(array.get(position).toString())

    }


}
