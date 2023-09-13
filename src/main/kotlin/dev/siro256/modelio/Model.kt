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
    ) {
        /**
         * [Why add 0.0f?](https://twitter.com/i/status/1701898660140003510)
         */
        override fun equals(other: Any?) =
            other is Vector2f &&
                    (other.x + 0.0f).equals(x + 0.0f) &&
                    (other.y + 0.0f).equals(y + 0.0f)

        override fun hashCode(): Int {
            var result = x.hashCode()
            result = 31 * result + y.hashCode()
            return result
        }
    }

    data class Vector3f(
        val x: Float,
        val y: Float,
        val z: Float,
    ) {
        /**
         * [Why add 0.0f?](https://twitter.com/i/status/1701898660140003510)
         */
        override fun equals(other: Any?) =
            other is Vector3f &&
                    (other.x + 0.0f).equals(x + 0.0f) &&
                    (other.y + 0.0f).equals(y + 0.0f) &&
                    (other.z + 0.0f).equals(z + 0.0f)

        override fun hashCode(): Int {
            var result = x.hashCode()
            result = 31 * result + y.hashCode()
            result = 31 * result + z.hashCode()
            return result
        }
    }
}
