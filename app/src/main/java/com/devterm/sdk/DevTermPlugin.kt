package com.devterm.sdk

interface DevTermPlugin {

    val id:String
    val name:String
    val version:String
    val author:String

    fun onLoad()

    fun onEnable()

    fun onDisable()

}
