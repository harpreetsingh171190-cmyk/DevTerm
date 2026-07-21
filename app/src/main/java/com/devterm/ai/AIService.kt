package com.devterm.ai

interface AIService {

    fun ask(prompt: String): String

    fun fixCommand(command: String): String

    fun explain(error: String): String
}
