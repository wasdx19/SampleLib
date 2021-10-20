package com.alabs.samplelib

import android.content.Context
import android.widget.Toast

class MessageUtil {

    fun showMessage(context: Context, message: String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}