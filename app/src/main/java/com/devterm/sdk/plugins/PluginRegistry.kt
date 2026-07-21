package com.devterm.sdk.plugins

import com.devterm.sdk.DevTermPlugin

object PluginRegistry {

    private val plugins =
        mutableListOf<DevTermPlugin>()

    fun register(plugin:DevTermPlugin){
        plugins.add(plugin)
        plugin.onLoad()
    }

    fun enableAll(){
        plugins.forEach{
            it.onEnable()
        }
    }

    fun disableAll(){
        plugins.forEach{
            it.onDisable()
        }
    }

    fun list() = plugins
}
