package com.devterm.assistant

class PromptEngine {

    fun generate(type:String,input:String):String {

        return """
Role: Senior Developer AI

Task Type:
$type

Input:
$input

Provide:
- Solution
- Code
- Explanation
- Optimization
"""
    }
}
