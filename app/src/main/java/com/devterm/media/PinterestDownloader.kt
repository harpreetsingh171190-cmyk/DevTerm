package com.devterm.media

class PinterestDownloader: MediaDownloader {

    override val platform = "Pinterest"

    override fun download(url:String):String {

        return """
Pinterest Download:

Supported:
✓ Single Image
✓ Single Video
✓ Board
✓ Video Board
"""
    }
}
