package dev.siro256.modelio

import java.util.Optional

data class Model(
    val objects: List<Object>,
) {
    data class Object(
        val name: String,
        val faces: List<Face>,
    )

    data class Face(
        val material: Optional<String>,
        val faceNormal: Vector3f,
        val first: Vertex,
        val second: Vertex,
        val third: Vertex,
    )

    data class Vertex(
        val coordinate: Vector3f,
        val normal: Optional<Vector3f>,
        val uv: Optional<Vector2f>,
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
