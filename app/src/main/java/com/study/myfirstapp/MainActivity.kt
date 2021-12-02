package com.study.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ActionMode

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "У лукоморья дуб зеленый")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Златая цепь на дубе том")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "И днем и ночью кот ученый")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Все ходит по цепи кругом")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Идет направо-песнь заводит")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Там чудеса")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "На лево-сказки говорит")
    }
}
