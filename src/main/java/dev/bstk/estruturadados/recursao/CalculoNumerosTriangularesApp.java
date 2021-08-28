package dev.bstk.estruturadados.recursao;

import dev.bstk.utils.ConsoleUtils;
import dev.bstk.utils.StringUtils;

import java.util.Scanner;

public class CalculoNumerosTriangularesApp {

    private static final Scanner ENTRADA = new Scanner(System.in);

    public static void main(String[] args) {
        String continuar = "S";

        while ("S".equalsIgnoreCase(continuar) || "Y".equalsIgnoreCase(continuar)) {
            ConsoleUtils.limpar();
            System.out.print("Entre com a altura do triangulo = ");
            int altura = ENTRADA.nextInt();

            CalculoNumerosTriangulares.desenharRepresentacaoNumerosTriangulares(altura);

            continuar = continuarExecucao();
        }
    }

    private static String continuarExecucao() {
        System.out.print("Deseja refazer? ( S/N ) = ");
        String resposta = ENTRADA.next();

        if (StringUtils.isEmpty(resposta) || StringUtils.isNotSN(resposta)) {
            ConsoleUtils.limpar();
            continuarExecucao();
        }

        return resposta;
    }
}
