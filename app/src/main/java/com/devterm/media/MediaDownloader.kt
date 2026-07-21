package com.devterm.media

interface MediaDownloader {

    val platform:String

    fun download(url:String):String

}
