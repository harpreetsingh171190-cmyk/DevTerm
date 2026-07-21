package com.devterm.ssh

class SSHClient {

    fun connect(
        host:String,
        username:String,
        port:Int = 22
    ):String {

        return """
SSH Connection Ready

Host: $host
User: $username
Port: $port
"""
    }

    fun execute(command:String):String {

        return "Remote command: $command"
    }
}
