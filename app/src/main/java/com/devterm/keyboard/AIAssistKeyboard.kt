package com.devterm.keyboard

class AIAssistKeyboard {


    fun completeText(
        text:String
    ):String {

        return """
AI Suggestion:

$text ...

[Continue]
[Rewrite]
[Fix Grammar]
"""
    }


    fun codeComplete(
        code:String
    ):String {

        return """
Code AI:

$code

Generating completion...
"""
    }


    fun voiceToText(
        speech:String
    ):String {

        return """
Voice Input:

$speech

Converted Text Ready
"""
    }

}
