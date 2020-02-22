package com.example.tfg_fatigapr.ViewModels

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelEjerciciosFactory(val context: Context) :ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ViewModelEjercicios::class.java)) {
            return ViewModelEjercicios(
                context
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}