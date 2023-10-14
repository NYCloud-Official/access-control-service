package tech.dimasyudha

import io.ktor.server.application.*
import tech.dimasyudha.plugins.*

fun main(args: Array<String>) {
    io.ktor.server.cio.EngineMain.main(args)
}

fun Application.module() {
    configureRouting()
}
