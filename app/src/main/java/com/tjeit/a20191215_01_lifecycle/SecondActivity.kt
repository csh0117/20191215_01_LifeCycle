package com.tjeit.a20191215_01_lifecycle

import android.os.Bundle

class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

    }


    override fun setupEvent() {
    }

    override fun setValue() {
    }
}
