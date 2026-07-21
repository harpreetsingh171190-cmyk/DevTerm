package com.devterm.dashboard

class DashboardManager {

    fun open(module:String):String {

        return when(module){

            "AI" ->
            "Opening AI Assistant 🤖"

            "UPDATE" ->
            "Opening Update Manager 🔄"

            "DOWNLOAD" ->
            "Opening Downloader 📥"

            "SSH" ->
            "Opening SSH Client 🌐"

            "PLUGIN" ->
            "Opening Plugin Manager 🔌"

            "SETTINGS" ->
            "Opening Settings ⚙️"

            else ->
            "Unknown Module"

        }
    }
}
