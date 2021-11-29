package com.manish.sample

import android.app.Activity
import android.os.Bundle
import android.content.Intent
import android.os.PersistableBundle

import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.manish.sample.ui.ActivityB


class MainActivity : AppCompatActivity() {



    lateinit var editTxt1 :EditText
    lateinit var editTxt3 :EditText
    lateinit var editTxt2 :EditText
    lateinit var button  : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("onCreate ------ ", "MainActivity: onCreate()")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUI()
        Log.i(Companion.TAG, "11111  : savedInstanceState   $savedInstanceState")
        val e1 = savedInstanceState?.getString("editTxt1","" );
        Log.i(Companion.TAG, "onCreate  : savedInstanceState $e1      "  )
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        Log.i(Companion.TAG, "2222 persistentState  : savedInstanceState   $savedInstanceState")
        val e1 = savedInstanceState?.getString("editTxt1","" );
        Log.i(Companion.TAG, "onCreate  : savedInstanceState $e1     "  )
    }

    private fun setupUI() {
        Log.i(Companion.TAG, "setupUI called  :  ")

        button = findViewById<Button>(R.id.bttn1)
        button.setOnClickListener(View.OnClickListener {
            Log.i(Companion.TAG, "text1 click  :  ")
            switchActivity()
        })
        editTxt1 = findViewById<EditText>(R.id.editTxt1)
        editTxt2 = findViewById<EditText>(R.id.editTxt2)
        editTxt3 = findViewById<EditText>(R.id.editTxt3)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(Companion.TAG, "onSaveInstanceState ::::: ")

        val e1 =  editTxt1.getText() .toString()
       val e2 =  editTxt2.text.toString()
        outState.putString("editTxt1", editTxt1.text.toString());
        outState.putString("editTxt2", editTxt2.text.toString());

        Log.i(Companion.TAG, "onSaveInstanceState  ::::: "+e1 +" ee2 "+e2)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        Log.i(Companion.TAG, "onRestoreInstanceState  ::::: "+savedInstanceState)

        val e1 = savedInstanceState.getString("editTxt1","" );
        val e2 = savedInstanceState.getString("editTxt2", "")
        Log.i(Companion.TAG, "onRestoreInstanceState  ::::: e1: "+e1 +",  e2 ::: "+e2)

        editTxt1.setText(e1.toString())
        editTxt2.setText(e2.toString())

    }

    fun switchActivity( ) {
        val intent = Intent(this@MainActivity, ActivityB::class.java)
        startActivity(intent)
    }


    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_main)
        Log.i(Companion.TAG, "onStart() callback started")

    }

    override fun onRestart() {
        super.onRestart()
        setContentView(R.layout.activity_main)
        Log.i(Companion.TAG, "onRestart() callback started")


    }

    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main)
        Log.i(Companion.TAG, "onResume() callback started")


    }

    override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_main)
        Log.i(Companion.TAG, "onPause() callback started")


    }

    override fun onStop() {
        super.onStop()
        setContentView(R.layout.activity_main)
        Log.i(Companion.TAG, "onStop() callback started")

    }

    override fun onDestroy() {
        super.onDestroy()
        setContentView(R.layout.activity_main)
        Log.i(Companion.TAG, "onDestroy() callback started")

        //no toast is possible here because context will be null
    }

    companion object {
        val TAG = "MainActivity"
    }

    fun handleBtn2(view: View) {
        switchActivity()

    }


}