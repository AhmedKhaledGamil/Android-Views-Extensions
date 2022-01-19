@file:Suppress("unused")

// package com.app_name.app.extensions

import android.content.res.ColorStateList
import android.widget.ImageView
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat.getColor

fun ImageView.setTintColor(@ColorRes color: Int) {
    this.imageTintList = ColorStateList.valueOf(
        getColor(
            context,
            color
        )
    )
}

fun ImageView.removeTintColor() {
    this.imageTintList = null
}