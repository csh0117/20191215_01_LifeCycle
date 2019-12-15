package com.tjeit.a20191215_01_lifecycle

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvent()
    }


    override fun setupEvent() {
        callActivityBtn.setOnClickListener {
            val intent = Intent(mContext, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun setValue() {
    }
}
