package com.tjeit.a20191215_01_lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    var lastBackButtonTime = 0L

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

    override fun onBackPressed() {
        val currentTime = System.currentTimeMillis()
//        현재 시간 기준으로 1초 이내에 백버튼을 누른 기록이 있다면 종료
//        간격이 1초가 넘어가면 토스트
        if (currentTime - lastBackButtonTime > 1000)  {
            Toast.makeText(mContext, "한번 더 뒤로 버튼을 누르면 종료됩니다",Toast.LENGTH_SHORT).show()
            lastBackButtonTime = currentTime
        } else {
            finish()
        }
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
