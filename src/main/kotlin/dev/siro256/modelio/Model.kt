package dev.siro256.modelio

data class Model(
    val materials: List<String>,
    val objects: List<Object>,
) {
    data class Object(
        val name: String,
        val faces: List<Face>,
    )

    data class Face(
        val material: Int?,
        val first: Vertex,
        val second: Vertex,
        val third: Vertex,
    )

    data class Vertex(
        val coordinate: Vector3f,
        val normal: Vector3f,
        val uv: Vector2f?,
    )

    data class Vector2f(
        val x: Float,
        val y: Float,
    )

    data class Vector3f(
        val x: Float,
        val y: Float,
        val z: Float,
    )
}
