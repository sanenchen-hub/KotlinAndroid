package com.sanenchen.kotlindemo

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

/**
 * @ClassName: SecondActivity
 * @Description: 第二个Activity
 * @Author: sanenchen
 * @Date: 2020-08-18 01:32
 **/

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}