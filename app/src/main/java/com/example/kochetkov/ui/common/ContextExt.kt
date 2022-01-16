package com.example.kochetkov.ui.common

import android.content.Context
import android.content.res.Configuration

fun Context.isTablet(): Boolean {
    return ((this.resources.configuration.screenLayout
            and Configuration.SCREENLAYOUT_SIZE_MASK)
            >= Configuration.SCREENLAYOUT_SIZE_LARGE)
}