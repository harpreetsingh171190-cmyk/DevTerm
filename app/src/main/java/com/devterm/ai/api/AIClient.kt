package com.devterm.ai.api

class AIClient {


    fun send(
        prompt:String
    ):String {


        return when(
            AIConfig.provider
        ){

            "OLLAMA" ->
            "Local Ollama Request: $prompt"


            "OPENAI" ->
            "OpenAI Request: $prompt"


            "CLAUDE" ->
            "Claude Request: $prompt"


            "GEMINI" ->
            "Gemini Request: $prompt"


            else ->
            "Provider not selected"

        }

    }

}
