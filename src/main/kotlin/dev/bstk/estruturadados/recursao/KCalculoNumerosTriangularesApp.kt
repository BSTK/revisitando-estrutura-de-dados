package dev.bstk.estruturadados.recursao

import java.util.*

private val entrada = Scanner(System.`in`)
private val calculoNumerosTrianculares = KCalculoNumerosTriangulares()

fun main() {
  var continuar = "S"

  while ("S".equals(continuar, true) or "Y".equals(continuar, true)) {
    /// TODO: CLASSE PARA LIMPAR CONSOLE

    println("Informe a altura do triangulo: ")
    val altura = entrada.nextInt()

    println("Mostrar desenho ( S/N ): ")
    val mostrarDesenho = entrada.next()

    println("Mostrar estatisticas ( S/N): ")
    val mostrarEstatisticas = entrada.next()

    if ("S".equals(mostrarDesenho, true)) {
      calculoNumerosTrianculares.desenharRepresentacaoNumerosTriangulares(altura)
    }

    if ("S".equals(mostrarEstatisticas, true)) {
      calculoNumerosTrianculares.estatisticas(altura)
    }

    continuar = continuarExecucao()
  }
}

fun continuarExecucao(): String {
  println("Deseja refazer? ( S/N ): ")
  val resposta = entrada.next()

  if (resposta.isEmpty()
      || (!resposta.equals("S", true)
      && !resposta.equals("N", true))) {
    /// TODO: LIMPAR CONSOLE
    continuarExecucao()
  }

  return resposta
}
