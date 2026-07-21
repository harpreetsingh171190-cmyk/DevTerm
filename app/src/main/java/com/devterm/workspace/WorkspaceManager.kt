package com.devterm.workspace

data class WorkspaceModule(
    val id:String,
    val title:String,
    val icon:String,
    val enabled:Boolean=true
)

object WorkspaceManager {

    val modules = listOf(

        WorkspaceModule("terminal","Terminal","💻"),
        WorkspaceModule("editor","Code Editor","📝"),
        WorkspaceModule("explorer","File Explorer","📂"),
        WorkspaceModule("git","Git","🌿"),
        WorkspaceModule("ai","AI Assistant","🤖"),
        WorkspaceModule("ssh","SSH","🌐"),
        WorkspaceModule("linux","Linux Desktop","🐧"),
        WorkspaceModule("downloads","Downloads","📥"),
        WorkspaceModule("plugins","Plugins","🔌"),
        WorkspaceModule("docker","Docker","🐳"),
        WorkspaceModule("database","Database","🗄"),
        WorkspaceModule("markdown","Markdown","📄"),
        WorkspaceModule("preview","Live Preview","🌍"),
        WorkspaceModule("settings","Settings","⚙️")

    )

    fun enabledModules() =
        modules.filter { it.enabled }

}
