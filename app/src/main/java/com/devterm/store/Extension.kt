package com.devterm.store

data class Extension(
    val id:String,
    val name:String,
    val version:String,
    val category:String,
    val description:String,
    val installed:Boolean=false
)
