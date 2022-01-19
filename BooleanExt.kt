@file:Suppress("unused")

// package com.app_name.app.extensions


val Boolean?.asSafeBoolean: Boolean
    get() = this ?: false