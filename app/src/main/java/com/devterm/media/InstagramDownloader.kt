package com.devterm.media

class InstagramDownloader: MediaDownloader {

    override val platform = "Instagram"

    override fun download(url:String):String {

        return """
Instagram Support:

✓ Reel
✓ Video
✓ Image
✓ Profile media
"""
    }
}
