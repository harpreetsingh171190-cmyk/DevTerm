package com.devterm.settings

import android.content.Context

class AISettingsManager(
private val context:Context
){

private val pref =
context.getSharedPreferences(
"devterm_ai",
Context.MODE_PRIVATE
)


fun save(
openai:String,
claude:String,
gemini:String,
ollama:String
){

pref.edit()
.putString("openai",openai)
.putString("claude",claude)
.putString("gemini",gemini)
.putString("ollama",ollama)
.apply()

}


fun get(key:String):String{

return pref.getString(
key,
""
) ?: ""

}

}
