package dev.bstk.estruturadados.recursao;

import java.util.Scanner;

public class CalculoNumerosTriangularesApp {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Entre com a altura do triangulo = ");
            int altura = entrada.nextInt();

            CalculoNumerosTriangulares.desenharRepresentacaoNumerosTriangulares(altura);
        }
    }
}
