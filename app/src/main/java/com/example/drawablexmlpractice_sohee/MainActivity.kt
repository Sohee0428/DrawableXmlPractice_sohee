package com.example.drawablexmlpractice_sohee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        기본 액션바를 불러내자
        val defaultActionBar = supportActionBar!!

//        모드를 커스텀 지원으로 설정
        defaultActionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM

//        실제로 어떤 커스텀뷰를 사용할건지?
        defaultActionBar.setCustomView(R.layout.my_custom_actionbar)

//       커스텀뷰를 들고 있는 툴바를 변수로 저장
        val toolbar = defaultActionBar.customView.parent as androidx.appcompat.widget.Toolbar
        toolbar.setContentInsetsAbsolute(0, 0)
    }
}