package dev.bstk.estruturadados.recursao;

public class CalculoNumerosTriangulares {

    public static void desenharRepresentacaoNumerosTriangulares(int altura) {
        StringBuilder triangulo = new StringBuilder();

        for (int i = 0; i <= altura; i++) {
            triangulo
                .append("▩ ".repeat(i))
                .append("\n");
        }

        triangulo
            .append("\n")
            .append(String.format("# Altura = %s %n", altura))
            .append(String.format("# Colunas = %s %n", altura))
            .append(String.format("# Total = %s %n", calcularQuantidadeItensRecursivo(altura)));

        System.out.println(triangulo.toString());
    }

    public static int calcularQuantidadeItens(int altura) {
        if (altura == 0) {
            return 0;
        }

        int totalQuadrados = 0;

        while (altura > 0) {
            totalQuadrados += altura;
            altura--;
        }

        return totalQuadrados;
    }

    public static int calcularQuantidadeItensRecursivo(int altura) {
        if (altura == 0) {
            return 0;
        }

        if (altura == 1)  {
            return 1;
        }

        return (altura + calcularQuantidadeItensRecursivo(altura - 1));
    }
}
