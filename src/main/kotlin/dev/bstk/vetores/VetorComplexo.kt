package dev.bstk.vetores

class VetorComplexo {

    fun exibeIndices() {
        println("Indices do Vetor: [1, 3, 4, 5, 6, 6]")
    }

    fun exibeValores() {
        println("Indices do Vetor: {1 = 0}, {2 = 8}, {4 = 4}, {5 = 32}")
    }
}

fun main() {
    val vetorComplexo = VetorComplexo()
    vetorComplexo.exibeIndices()
    vetorComplexo.exibeIndices()
    vetorComplexo.exibeValores()
    vetorComplexo.exibeValores()
}
