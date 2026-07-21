package com.devterm.sdk.plugins

import com.devterm.sdk.DevTermPlugin

class SamplePlugin : DevTermPlugin {

    override val id = "sample"

    override val name = "Sample Plugin"

    override val version = "1.0"

    override val author = "DevTerm"

    override fun onLoad(){}

    override fun onEnable(){}

    override fun onDisable(){}

}
