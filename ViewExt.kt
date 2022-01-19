@file:Suppress("unused")

// package com.app_name.app.extensions

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getColor
import androidx.core.view.updateMarginsRelative

fun View.setBackground(@DrawableRes drawableRes: Int) {
    this.background = ContextCompat.getDrawable(context, drawableRes)
}

fun View.setBackgroundTintColor(color: String) {
    this.backgroundTintList = ColorStateList.valueOf(Color.parseColor(color))
}

fun View.setBackgroundTintColor(@ColorRes color: Int) {
    this.backgroundTintList = ColorStateList.valueOf(getColor(context, color))
}

fun View.removeBackgroundTintColor() {
    this.backgroundTintList = null
}

fun View.updateMarginsRelative(left: Int = 0, top: Int = 0, right: Int = 0, bottom: Int = 0) {
    if (this.layoutParams is ViewGroup.MarginLayoutParams) {
        val params = this.layoutParams as ViewGroup.MarginLayoutParams
        params.updateMarginsRelative(left, top, right, bottom)
        this.requestLayout()
    }
}

fun View.gone() {
    this.visibility = View.GONE
}

fun View.visible() {
    this.visibility = View.VISIBLE
}

fun View.invisible() {
    this.visibility = View.INVISIBLE
}