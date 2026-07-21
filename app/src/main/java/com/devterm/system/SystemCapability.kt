package com.devterm.system

data class Feature(
    val name:String,
    val available:Boolean
)

object SystemCapability {

    private fun hasRoot():Boolean{
        return java.io.File("/system/xbin/su").exists() ||
               java.io.File("/system/bin/su").exists()
    }

    fun features():List<Feature>{

        val root = hasRoot()

        return listOf(

            Feature("Terminal",true),
            Feature("AI Assistant",true),
            Feature("Linux Desktop",true),
            Feature("SSH",true),
            Feature("Git",true),
            Feature("Python",true),
            Feature("NodeJS",true),
            Feature("Docker Remote",true),
            Feature("File Manager",true),
            Feature("Media Downloader",true),
            Feature("Voice AI",true),

            Feature("System Partition",root),
            Feature("Boot Image",root),
            Feature("Magisk Modules",root),
            Feature("Kernel Tweaks",root),
            Feature("SELinux",root)

        )

    }

}
