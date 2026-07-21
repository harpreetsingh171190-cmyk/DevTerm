package com.devterm.ai.provider

interface AIProvider {
    suspend fun send(prompt:String):String
}
