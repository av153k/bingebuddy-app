package com.bingebuddy.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform