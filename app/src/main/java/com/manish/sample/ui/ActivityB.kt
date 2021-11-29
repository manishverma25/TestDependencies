package com.manish.sample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.manish.sample.R

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart ------ ", "ActivityB  :  onStart()")
    }


    override fun onResume() {
        super.onResume()
        Log.e("onResume ------ ", "ActivityB  :  onResume()")
    }


    override fun onPause() {
        super.onPause()
        Log.e("onPause ------ ", "ActivityB  :  onPause()")
    }


    override fun onStop() {
        super.onStop()
        Log.e("onStop ------ ", "ActivityB  :  onStop()")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy ------ ", "ActivityB  :  onDestroy()")
    }


    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart ------ ", "ActivityB  :  onRestart()")
    }
}