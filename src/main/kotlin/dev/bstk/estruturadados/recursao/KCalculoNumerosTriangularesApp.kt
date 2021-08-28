package dev.bstk.estruturadados.recursao

import dev.bstk.S
import dev.bstk.isNotSN
import dev.bstk.limparConsole
import java.util.*

private val entrada = Scanner(System.`in`)
private val calculoNumerosTrianculares = KCalculoNumerosTriangulares()

fun main() {
  var continuar = S

  while (S.equals(continuar, true)) {
    limparConsole()

    print("Informe a altura do triangulo: ")
    val altura = entrada.nextInt()

    print("Mostrar desenho ( S/N ): ")
    val mostrarDesenho = entrada.next()

    print("Mostrar estatisticas ( S/N): ")
    val mostrarEstatisticas = entrada.next()

    if (S.equals(mostrarDesenho, true)) {
      calculoNumerosTrianculares.desenharRepresentacaoNumerosTriangulares(altura)
    }

    if (S.equals(mostrarEstatisticas, true)) {
      calculoNumerosTrianculares.estatisticas(altura)
    }

    continuar = continuarExecucao()
  }
}

fun continuarExecucao(): String {
  print("Deseja refazer? ( S/N ): ")
  val resposta = entrada.next()

  if (resposta.isEmpty() || isNotSN(resposta)) {
    limparConsole()
    continuarExecucao()
  }

  return resposta
}
