package com.devterm.update

object UpdateCommands {

    val termuxUpdate =
        "pkg update -y && pkg upgrade -y"

    val pythonUpdate =
        "pip list --outdated"

    val nodeUpdate =
        "npm update -g"

    val gitUpdate =
        "git pull"

}
