package dev.bstk.estruturadados.recursao;

public class CalculoNumerosTriangulares {

    private CalculoNumerosTriangulares() { }

    public static void desenharRepresentacaoNumerosTriangulares(int altura) {
        StringBuilder triangulo = new StringBuilder();

        for (int i = 0; i <= altura; i++) {
            triangulo
                .append("▩ ".repeat(i))
                .append("\n");
        }

        System.out.println(triangulo.toString());
    }

    public static void estatitisticas(int altura) {
        String estatitisticas
            = String.format("# Altura = %s %n", altura)
            + String.format("# Colunas = %s %n", altura)
            + String.format("# Total = %s %n", calcularQuantidadeItensRecursivo(altura));

        System.out.println(estatitisticas);
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
