package com.example.news

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.DownloadListener
import android.webkit.WebView
import android.webkit.WebViewClient

class NewsLayout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_layout)

       // this intent is used for retriving selected news data
     //   nad fetch news.url on load Url
        val news=intent.getParcelableExtra<News>(MainActivity.USER_KEY)
        val myWebView: WebView = findViewById(R.id.news_web_view)//object creation

        myWebView.loadUrl("https://www.instagram.com/?hl=en")//for loading url

        myWebView.settings.javaScriptEnabled = true//for enabling java script to perform amimations

        myWebView.webViewClient = WebViewClient()//for enabling in app clicks in web view

        //for downloading files in webview
        myWebView.setDownloadListener(DownloadListener { url, userAgent, contentDisposition, mimetype, contentLength ->
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        })
    }
}
