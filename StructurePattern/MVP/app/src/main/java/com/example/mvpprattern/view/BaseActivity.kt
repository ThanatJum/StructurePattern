package com.example.mvpprattern.view

import android.arch.lifecycle.ViewModelProvider
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatDelegate
import com.akexorcist.localizationactivity.ui.LocalizationActivity
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

abstract class BaseActivity : LocalizationActivity(), HasSupportFragmentInjector {
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = dispatchingAndroidInjector
    init {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)

requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialize(savedInstanceState)
        setupView()
    }
    abstract fun initialize(savedInstanceState: Bundle?)
    abstract fun setupView()
}