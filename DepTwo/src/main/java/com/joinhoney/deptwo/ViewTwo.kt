package com.joinhoney.deptwo

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import com.joinhoney.singleton.TheObject

@SuppressLint("AppCompatCustomView")
class ViewTwo(context: Context, attrs: AttributeSet) : TextView(context, attrs) {
    init {
        this.text = "${TheObject.version} - ${System.identityHashCode(TheObject)}"
    }
}