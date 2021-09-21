package no.nav.dagpenger.div.test

import io.ktor.server.engine.ApplicationEngine
import no.nav.helse.rapids_rivers.KtorBuilder

fun main() {
    val application: ApplicationEngine = KtorBuilder().liveness { true }.readiness { true }.port(Config.port).build()
    application.start()

    Runtime.getRuntime().addShutdownHook(
        Thread { application.stop(gracePeriodMillis = 100, timeoutMillis = 101L) }
    )
}
