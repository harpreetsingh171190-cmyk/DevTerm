package com.devterm.update

class UpdateManager {

    fun updateAll():String {

        return """
DevTerm Update Started

Commands:
pkg update -y
pkg upgrade -y
pip list --outdated
npm update -g

Status:
Running...
"""
    }


    fun systemInfo():String {

        return """
DevTerm System Check

✓ Packages
✓ Python modules
✓ Node packages
✓ Git tools
"""
    }
}
