package com.devterm.ai.provider

class LocalAI : AIProvider {

    override suspend fun send(prompt:String):String {

        // Ollama local endpoint
        return "Local AI response: $prompt"
    }
}
