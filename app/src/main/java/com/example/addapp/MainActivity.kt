package com.example.addapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //idの取得
        val et1: EditText = findViewById(R.id.et1)
        val et2: EditText = findViewById(R.id.et2)
        val btnAdd: Button = findViewById(R.id.btnAdd)
        val tvAns: TextView = findViewById(R.id.tvAns)
        val btnClear: Button = findViewById(R.id.btnClear)

        //クリック処理（足し算）
        btnAdd.setOnClickListener {
            //EditTextを数値型に変換することが必要,sumは型推論でInt必要なし
            val sum = et1.text.toString().toInt() + et2.text.toString().toInt()
            tvAns.text = "合計は$sum"
        }

        //クリア処理
        btnClear.setOnClickListener {
            et1.text.clear()
            et2.text.clear()
            tvAns.text = "答え"
        }
    }
}
