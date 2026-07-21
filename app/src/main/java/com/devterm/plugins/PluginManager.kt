package com.devterm.plugins

class PluginManager {

    private val plugins =
        mutableListOf<DevTermPlugin>()

    fun register(plugin:DevTermPlugin){
        plugins.add(plugin)
    }

    fun run(name:String,input:String):String{
        val plugin =
            plugins.find { it.name == name }

        return plugin?.execute(input)
            ?: "Plugin not found"
    }
}
