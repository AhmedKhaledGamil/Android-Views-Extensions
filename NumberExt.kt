@file:Suppress("unused")

// package com.app_name.app.extensions

import android.content.res.Resources
import android.util.TypedValue
import java.util.*

val Number?.asSafeInt: Int
    get() = (this ?: -1) as Int

val Number?.asSafeDouble: Double
    get() = (this ?: -1) as Double

val Number?.asSafeString: String
    get() = (this ?: -1).toString()

val Number.dpInPixels: Int
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this.toFloat(),
        Resources.getSystem().displayMetrics
    ).toInt()

val Number.commaSeparated: String
    get() = "%,d".format(Locale.ENGLISH, this.toInt())