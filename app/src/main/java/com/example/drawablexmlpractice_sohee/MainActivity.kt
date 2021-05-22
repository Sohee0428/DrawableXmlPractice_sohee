package com.example.drawablexmlpractice_sohee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {

//    액션바에 있는 UI를 담아둘 변수
//    변수 : 멤버 변수 => 담아주는 행위 : onCreate
    lateinit var toastBtn : Button


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


//       커스텀 액션바에 달아둔 버튼을 찾아오기
       toastBtn = defaultActionBar.customView.findViewById(R.id.toastBtn)
       
       toastBtn.setOnClickListener {
           Toast.makeText(this, "액션바를 통한 토스트", Toast.LENGTH_SHORT).show()
       }

    }
}