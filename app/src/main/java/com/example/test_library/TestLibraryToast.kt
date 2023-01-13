package com.example.test_library

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TestLibraryToast : AppCompatActivity() {
    fun makeToast(){
        Toast.makeText(this, "test toast show", Toast.LENGTH_SHORT).show()
    }
}