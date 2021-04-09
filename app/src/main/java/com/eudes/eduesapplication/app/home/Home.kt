package com.eudes.eduesapplication.app.home

import com.eudes.eduesapplication.app.home.model.New

interface Home {
    interface View{
        fun presentNews()

        fun callNews()

        fun presentNew(new: New)


    }

    interface Controller{
        fun onNewsClicked(new: New)

    }
}