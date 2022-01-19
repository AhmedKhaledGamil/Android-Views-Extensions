@file:Suppress("unused")

// package com.app_name.app.extensions

import android.text.SpannableString
import android.text.style.UnderlineSpan

val String?.asSafeString: String
    get() = this ?: ""

val String?.asSafeDouble: Double
    get() = this?.toDouble() ?: 0.0

val String?.isNotNullOrEmpty: Boolean
    get() = !this.isNullOrEmpty()

val String?.commaSeparated: String
    get() {
        val asDouble = this?.toDoubleOrNull()
        if (asDouble != null) {
            val asInt = asDouble.toInt()
            return asInt.commaSeparated
        }
        return "0"
    }

val String.underlined: SpannableString
    get() {
        val content = SpannableString(this)
        content.setSpan(UnderlineSpan(), 0, content.length, 0)
        return content
    }

val String.addBreakLines: String
    get() = when {
        this.contains(" ") -> {
            this.replace(" ", "\n")
        }
        else -> {
            this
        }
    }

val String.removeCommas: String
    get() = when {
        this.contains(",") -> {
            this.replace(",", "")
        }
        this.contains("٬") -> {
            this.replace("٬", "")
        }
        else -> {
            this
        }
    }

val String?.removeLastIfComma: String?
    get() = if (this != null) {
        if (this.isNotEmpty() && this.last() == ',') {
            this.substring(0, this.length - 1)
        } else {
            this
        }

    } else {
        null
    }