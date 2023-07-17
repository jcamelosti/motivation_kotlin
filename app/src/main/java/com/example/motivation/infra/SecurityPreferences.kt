package com.example.motivation.infra

import android.content.Context
import android.content.SharedPreferences

class SecurityPreferences(context: Context) {
    private val security: SharedPreferences =
        context.getSharedPreferences("Motivation", Context.MODE_PRIVATE)

    fun storeString(chave: String, str: String){
        security.edit().putString(chave, str).apply()
    }

    fun getString(chave: String): String {
        return security.getString(chave, "") ?: ""
    }
}