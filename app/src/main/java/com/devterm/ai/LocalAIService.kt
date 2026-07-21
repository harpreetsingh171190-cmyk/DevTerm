package com.devterm.ai

class LocalAIService : AIService {

    override fun ask(prompt: String): String {
        return "AI: $prompt"
    }

    override fun fixCommand(command: String): String {
        return "Checking command: $command"
    }

    override fun explain(error: String): String {
        return "Explanation: $error"
    }
}
