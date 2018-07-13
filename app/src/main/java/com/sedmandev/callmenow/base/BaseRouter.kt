package com.sedmandev.callmenow.base

import android.content.Context
import android.content.Intent
import com.sedmandev.callmenow.base.interfaces.Router

abstract class BaseRouter : Router {

  override fun startActivity(context: Context, cls: Class<*>) {
    //val intent = Intent(context, SplashActivity::class.java)
    val intent = Intent(context, cls)
    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
    context.startActivity(intent)
  }
}
