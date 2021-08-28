package dev.bstk.estruturadados.recursao

class KCalculoNumerosTriangulares {

  fun desenharRepresentacaoNumerosTriangulares(tamanho: Int) {
    val builder = StringBuilder()

    for (i in tamanho..0) {
      builder
          .append("▩ ".repeat(i))
          .append("\n")
    }

    println("Desenho triangulo")
    println(builder.toString())
  }

  fun estatisticas(altura: Int) {
    val estatisticas = String
        .format("# Altura = %s %n", altura)
        .plus(String.format("# Colunas = %s %n", altura))
        .plus(String.format("# Total = %s %n", calcularQuantidadeItensRecursivo(altura)))

    println(estatisticas)
  }

  private fun calcularQuantidadeItensRecursivo(altura: Int): Int {
    if (altura == 0) return 0
    if (altura == 1) return 1

    return (altura + calcularQuantidadeItensRecursivo(altura - 1))
  }
}
