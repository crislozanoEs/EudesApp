package com.eudes.eduesapplication.base.navigation

import android.content.Context
import android.content.Intent
import com.eudes.eduesapplication.app.home.view.MainActivity

class EudesNavigation(private val context: Context) {
    fun goHome(isSame: Boolean){
        val intent = Intent(context, MainActivity::class.java)
        if(isSame) intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        context.startActivity(intent)
    }
    fun goEvents(){
        val intent = Intent(context, MainActivity::class.java)
        context.startActivity(intent)
    }


}