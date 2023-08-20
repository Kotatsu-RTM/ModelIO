package dev.siro256.modelio

interface ModelIO {
    val extension: Array<String>

    fun parse(byteArray: ByteArray): Result<Model>

    fun export(model: Model): Result<ByteArray>
}
