package com.devterm.dashboard

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.termux.app.R

class DevTermDashboardActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.devterm_dashboard)


        val ai =
            findViewById<Button>(R.id.aiButton)

        val update =
            findViewById<Button>(R.id.updateButton)

        val download =
            findViewById<Button>(R.id.downloadButton)

        val ssh =
            findViewById<Button>(R.id.sshButton)

        val plugin =
            findViewById<Button>(R.id.pluginButton)

        val settings =
            findViewById<Button>(R.id.settingsButton)



        ai.setOnClickListener {
            Toast.makeText(
                this,
                "🤖 AI Assistant Opening",
                Toast.LENGTH_SHORT
            ).show()
        }


        update.setOnClickListener {
            Toast.makeText(
                this,
                "🔄 Update All Started",
                Toast.LENGTH_SHORT
            ).show()
        }


        download.setOnClickListener {
            Toast.makeText(
                this,
                "📥 Downloader Opening",
                Toast.LENGTH_SHORT
            ).show()
        }


        ssh.setOnClickListener {
            Toast.makeText(
                this,
                "🌐 SSH Client Opening",
                Toast.LENGTH_SHORT
            ).show()
        }


        plugin.setOnClickListener {
            Toast.makeText(
                this,
                "🔌 Plugin Manager Opening",
                Toast.LENGTH_SHORT
            ).show()
        }


        settings.setOnClickListener {
            Toast.makeText(
                this,
                "⚙️ Settings Opening",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
