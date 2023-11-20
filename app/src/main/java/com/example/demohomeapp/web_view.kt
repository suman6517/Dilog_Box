package com.example.demohomeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.webkit.WebView
import android.webkit.WebViewClient

class web_view : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        val webview = findViewById<WebView>(R.id.webview1)

        /*
        WebViewClient allows you to handle
        onPageFinished and override Url loading.
        */
        webview.webViewClient = WebViewClient()

        /* Load the URL */

        webview.loadUrl("https://wwview binding w.youtube.com/")

        /* Load the Java Script */
        webview.settings.javaScriptEnabled = true

        /* Make it Zoomable */

        webview.settings.setSupportZoom(true)


    }





}