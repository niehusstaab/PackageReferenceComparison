package com.joinhoney.depone

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import com.joinhoney.singleton.TheObject

@SuppressLint("AppCompatCustomView")
class ViewOne(context: Context, attrs: AttributeSet) : TextView(context, attrs) {
    init {
        this.text = "${TheObject.version} - ${System.identityHashCode(TheObject)}"
    }
}