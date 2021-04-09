package com.eudes.eduesapplication.app.home.view

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eudes.eduesapplication.R
import com.eudes.eduesapplication.app.BaseActivity
import com.eudes.eduesapplication.app.home.Home
import com.eudes.eduesapplication.app.home.model.New
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : BaseActivity(), Home.View {
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        super.onCreate(savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
        this.bottomNavigationView?.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home -> router?.goToHome(true)
                R.id.events -> router?.goToEvents()
            }
            return@setOnNavigationItemSelectedListener true
        }
    }

    override fun initViews() {
        this.bottomNavigationView = findViewById(R.id.main_bottom_navigation)
    }

    override fun presentNews() {
        TODO("Not yet implemented")
    }

    override fun callNews() {
        TODO("Not yet implemented")
    }

    override fun presentNew(new: New) {
        TODO("Not yet implemented")
    }

}