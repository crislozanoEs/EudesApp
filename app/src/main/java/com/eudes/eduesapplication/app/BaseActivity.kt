package com.eudes.eduesapplication.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eudes.eduesapplication.base.navigation.Router
import com.google.android.material.bottomnavigation.BottomNavigationView

abstract class BaseActivity : AppCompatActivity() {
    var bottomNavigationView: BottomNavigationView? = null
    var router: Router? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
        router = Router(this)
    }

    abstract fun initViews()

    override fun onDestroy() {
        super.onDestroy()
        router = null
    }

}