package com.devterm.media

class MediaManager {

    private val list =
        mutableListOf<MediaDownloader>()


    fun register(loader:MediaDownloader){
        list.add(loader)
    }


    fun download(url:String):String{

        val loader =
            list.firstOrNull {
                url.contains(
                    it.platform,
                    true
                )
            }

        return loader?.download(url)
            ?: "Platform not supported"
    }
}
