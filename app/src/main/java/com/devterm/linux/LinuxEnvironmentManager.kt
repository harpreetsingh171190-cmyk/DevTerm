package com.devterm.linux

class LinuxEnvironmentManager {


    fun list():List<String>{

        return listOf(
            "Ubuntu GNOME",
            "Ubuntu KDE",
            "Debian XFCE",
            "Arch KDE",
            "Fedora GNOME",
            "Alpine LXQt"
        )

    }


    fun install(
        environment:String
    ):String {

        return """
Installing:

$environment

Using:
proot-distro
Termux:X11
Desktop packages
"""
    }


    fun switch(
        environment:String
    ):String {

        return """
Switching Desktop:

$environment

Starting GUI...
"""
    }


    fun remove(
        environment:String
    ):String {

        return """
Removing:
$environment
"""
    }

}
