package com.eudes.eduesapplication.base.navigation

import android.content.Context

class Router(context: Context) {
    private var eudesNavigation: EudesNavigation = EudesNavigation(context)
    fun goToHome(isSame: Boolean){
        eudesNavigation.goHome(isSame)
    }

    fun goToEvents(){
        eudesNavigation.goEvents()
    }
}