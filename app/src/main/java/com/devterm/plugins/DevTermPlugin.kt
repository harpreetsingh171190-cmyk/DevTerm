package com.devterm.plugins

interface DevTermPlugin {
    val name:String
    val version:String

    fun execute(input:String):String
}
