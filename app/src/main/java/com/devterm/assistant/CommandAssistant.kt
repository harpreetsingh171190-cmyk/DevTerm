package com.devterm.assistant

class CommandAssistant {

    fun analyze(command:String):String {

        return when {

            command.contains("gradle", true) ->
                "Try: ./gradlew clean assembleDebug"

            command.contains("permission", true) ->
                "Check file permission using: ls -la"

            command.contains("not found", true) ->
                "Install missing package with pkg install"

            else ->
                "AI suggestion: Analyze command output"
        }
    }


    fun fix(error:String):String {

        return """
AI Error Analysis

Problem:
$error

Suggested steps:
1. Check logs
2. Verify dependencies
3. Retry build
"""
    }
}
