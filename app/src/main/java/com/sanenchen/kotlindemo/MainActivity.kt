package com.sanenchen.kotlindemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray

/**
 * @ClassName: MainActivity
 * @Description: 主功能类
 * @Author: sanenchen
 * @Date: 2020-08-18 01:32
 **/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //调用方法
        listenButton()
    }

    /**
     * 监听按钮
     */
    private fun listenButton() {
        /**
         * 监听显示Toast
         */
        button_show_toast.setOnClickListener {
            showToast("1234")
        }

        /**
         * 监听显示Dialog
         */
        button_show_dialog.setOnClickListener {
            showDialog("123", "123")
        }

        /**
         * 监听显示新Activity
         */
        button_new_activity.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

    }

    /**
     * 显示Toast
     */
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    /**
     * 显示Dialog
     */
    private fun showDialog(title: String, message: String) {
        AlertDialog.Builder(this).setTitle(title).setMessage(message).create().show()
    }
}