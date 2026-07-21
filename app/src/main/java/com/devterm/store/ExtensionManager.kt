package com.devterm.store

class ExtensionManager {

    fun install(id:String):String{
        return "Installing: $id"
    }

    fun uninstall(id:String):String{
        return "Removing: $id"
    }

    fun update(id:String):String{
        return "Updating: $id"
    }

}
