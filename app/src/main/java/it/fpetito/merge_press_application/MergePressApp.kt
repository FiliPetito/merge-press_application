package it.fpetito.merge_press_application

import android.app.Application
import com.tom_roush.pdfbox.BuildConfig
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp class MergePressApp : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
            Timber.d("Timber initialized")
        }
    }
}