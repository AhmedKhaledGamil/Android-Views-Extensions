@file:Suppress("unused")

// package com.app_name.app.extensions

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

fun CompositeDisposable.addDisposable(disposable: Disposable) {
    this.add(disposable)
}

fun CompositeDisposable.onClear() {
    this.dispose()
}