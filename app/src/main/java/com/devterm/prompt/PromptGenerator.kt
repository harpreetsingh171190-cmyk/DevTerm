package com.devterm.prompt

class PromptGenerator {

    fun codePrompt(task:String):String {
        return """
You are an expert developer.
Task:
$task

Provide:
- Clean code
- Explanation
- Best practices
"""
    }

    fun debugPrompt(error:String):String {
        return """
Analyze this error:
$error

Find:
1. Cause
2. Fix
3. Prevention
"""
    }
}
