package com.tjeit.a20191215_01_lifecycle

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setupEvent()
    abstract fun setValue()
}