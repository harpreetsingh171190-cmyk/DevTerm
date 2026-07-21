package com.devterm.media

class YoutubeDownloader: MediaDownloader {

    override val platform = "YouTube"

    override fun download(url:String):String {

        return "yt-dlp download started: $url"
    }
}
