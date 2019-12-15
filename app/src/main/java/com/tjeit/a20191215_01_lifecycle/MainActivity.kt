package com.tjeit.a20191215_01_lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setValue()
        setupEvent()

        Log.d("log]생명주기","onCreate 실행")
    }

    override fun setupEvent() {
        callActivityBtn.setOnClickListener {
            val intent = Intent(mContext, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun setValue() {
    }

    override fun onResume() {
        super.onResume()
        Log.d("log]생명주기","onResume 실행")
    }
    override fun onPause() {
        super.onPause()
        Log.d("log]생명주기","onPause 실행")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("log]생명주기","onDestroy 실행")
    }
}
