package com.devterm.store

object ExtensionStore {

    val extensions = listOf(

        Extension(
            "ai.openai",
            "OpenAI",
            "1.0",
            "AI",
            "OpenAI Provider"
        ),

        Extension(
            "ai.ollama",
            "Ollama",
            "1.0",
            "AI",
            "Local AI Models"
        ),

        Extension(
            "git.github",
            "GitHub",
            "1.0",
            "Developer",
            "GitHub Integration"
        ),

        Extension(
            "ssh.client",
            "SSH Client",
            "1.0",
            "Network",
            "Remote SSH"
        ),

        Extension(
            "media.downloader",
            "Media Downloader",
            "1.0",
            "Media",
            "Video/Image Downloader"
        ),

        Extension(
            "linux.manager",
            "Linux Manager",
            "1.0",
            "Linux",
            "Desktop Environments"
        )

    )

}
