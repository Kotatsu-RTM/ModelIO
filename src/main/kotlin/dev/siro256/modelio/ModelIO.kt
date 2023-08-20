package dev.siro256.modelio

interface ModelIO {
    val extension: Array<String>

    fun parse(byteArray: ByteArray): Model

    fun export(model: Model): ByteArray
}
