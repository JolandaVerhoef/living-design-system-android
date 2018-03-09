package com.jolandaverhoef.designsystem.library

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.View
import kotlinx.android.synthetic.main.merge_button.view.*

class Button @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    init {
        View.inflate(context, R.layout.merge_button, this)
    }

    fun render(active: Boolean) {
        button_image.setImageResource(
                if(active) android.R.drawable.ic_btn_speak_now
                else android.R.drawable.ic_delete)
    }
}
