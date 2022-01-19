@file:Suppress("unused")

// package com.app_name.app.extensions

import android.content.res.ColorStateList
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.annotation.FontRes
import androidx.core.content.ContextCompat.getColor
import androidx.core.content.res.ResourcesCompat

fun TextView.setDrawableColor(@ColorRes color: Int) {
    compoundDrawablesRelative.filterNotNull().forEach {
        it.colorFilter = PorterDuffColorFilter(getColor(context, color), PorterDuff.Mode.SRC_IN)
    }
}

fun TextView.setColor(@ColorRes color: Int) {
    this.setTextColor(
        ColorStateList.valueOf(
            getColor(
                context,
                color
            )
        )
    )
}

fun TextView.setFontFamily(@FontRes fontRes: Int) {
    val typeface = ResourcesCompat.getFont(context, fontRes)
    this.typeface = typeface
}

fun TextView.getUserInput(): String {
    return this.text.toString()
}