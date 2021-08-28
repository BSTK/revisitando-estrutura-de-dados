package dev.bstk

const val S = "S"
const val N = "N"

fun isSN(valor: String): Boolean {
  return valor.isNotEmpty()
      && valor.isNotBlank()
      && (valor.equals(S, true) || valor.equals(N, true))
}

fun isNotSN(valor: String): Boolean {
  return !isSN(valor)
}
