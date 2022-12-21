package com.toto.myfirstapplication.util

import android.content.Context
import android.preference.PreferenceManager
import android.renderscript.Sampler.Value

class SharedPreferences(val context:Context) {
    companion object{
        private const val FIRST_INSTALL = "FIRST INSTALL"
    }
    private val p = PreferenceManager.getDefaultSharedPreferences(context)

    var firstinstall = p.getBoolean(FIRST_INSTALL,false)
    set(value) = p.edit().putBoolean(FIRST_INSTALL, value).apply()
}