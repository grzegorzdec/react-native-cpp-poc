package com.cppreactnativepoc.hellofromcpp

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod


class HelloWorldModule(reactContext: ReactApplicationContext)//required by React Native
    : ReactContextBaseJavaModule(reactContext) {

    init {
        System.loadLibrary("helloworld")
    }

    private val cppApi: HelloWorld? = HelloWorld.create()

    override fun getName(): String {
        return "HelloWorld"
    }

    @ReactMethod
    fun sayHello(promise: Promise) {
        promise.resolve(cppApi?.helloWorld + "\n hello from android")
    }
}
