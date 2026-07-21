package com.devterm.ai.ui

import android.app.Activity
import android.os.Bundle
import android.widget.*
import com.termux.app.R


class AIChatActivity : Activity(){

override fun onCreate(
savedInstanceState: Bundle?
){
super.onCreate(savedInstanceState)

setContentView(R.layout.devterm_ai_chat)


val models = arrayOf(
"Ollama - Qwen3 Coder",
"Ollama - DeepSeek Coder",
"OpenAI GPT",
"Claude",
"Gemini"
)


val selector =
findViewById<Spinner>(
R.id.modelSelector
)

selector.adapter =
ArrayAdapter(
this,
android.R.layout.simple_spinner_dropdown_item,
models
)


val input =
findViewById<EditText>(
R.id.promptInput
)

val send =
findViewById<Button>(
R.id.sendButton
)

val response =
findViewById<TextView>(
R.id.aiResponse
)


send.setOnClickListener {

val model =
selector.selectedItem.toString()

val prompt =
input.text.toString()


response.text =
"""
Model:
$model

Prompt:
$prompt

AI:
Processing...
"""
}

}

}
