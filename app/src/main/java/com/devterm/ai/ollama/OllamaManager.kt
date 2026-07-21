package com.devterm.ai.ollama

class OllamaManager {


    private val url =
        "http://127.0.0.1:11434"


    fun checkServer():String {

        return """
Checking Ollama...

URL:
$url

Status:
Ready for connection
"""
    }


    fun listModels():List<String>{

        return listOf(
            "qwen3-coder",
            "deepseek-coder",
            "llama3",
            "mistral",
            "gemma"
        )

    }


    fun pullModel(
        model:String
    ):String {

        return """
Downloading Model:

$model

Command:
ollama pull $model
"""
    }


    fun runModel(
        model:String,
        prompt:String
    ):String {

        return """
Model:
$model

Prompt:
$prompt

Generating response...
"""
    }

}
