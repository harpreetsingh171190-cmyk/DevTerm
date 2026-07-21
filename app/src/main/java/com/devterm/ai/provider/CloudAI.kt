package com.devterm.ai.provider

class CloudAI : AIProvider {

    override suspend fun send(prompt:String):String {

        // OpenAI / Claude / Gemini API
        return "Cloud AI response: $prompt"
    }
}
