package com.tjeit.a20191215_01_lifecycle

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle

class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setValue()
        setupEvent()
    }
    override fun setupEvent() {
    }

    override fun setValue() {
    }

    override fun onBackPressed() {
//        super.onBackPressed()
        val alert = AlertDialog.Builder(mContext)
        alert.setTitle("게시글 작성 중지 확인")
        alert.setMessage("정말 글 작성을 중단 하시겠습니까? 작성하신 내용은 모두 삭제됩니다.")
        alert.setPositiveButton("확인", DialogInterface.OnClickListener { dialog, which ->
            finish()
        })
        alert.setNegativeButton("취소", null)
        alert.show()
    }
}
