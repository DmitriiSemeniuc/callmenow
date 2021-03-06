package com.sedmandev.callmenow.ui.main

import com.sedmandev.callmenow.base.BasePresenter
import io.reactivex.disposables.Disposable

class MainPresenter(mainView: MainView, private val interactor: MainInteractor) : BasePresenter<MainView>(mainView) {

  override fun inject() {
    injector.inject(this)
  }

  private var subscription: Disposable? = null

  override fun onCreate() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun onResume() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun onPause() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun onStop() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun onDestroy() {
    subscription?.dispose()
  }
}