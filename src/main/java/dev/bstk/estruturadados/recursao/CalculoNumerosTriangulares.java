package dev.bstk.estruturadados.recursao;

public class CalculoNumerosTriangulares {

    public static void main(String[] args) {
        System.out.println(String.format("Alturar 1, Tem [ %s ] quadrados", calcularQuantidadeItens(1)));
        System.out.println(String.format("Alturar 2, Tem [ %s ] quadrados", calcularQuantidadeItens(2)));
        System.out.println(String.format("Alturar 5, Tem [ %s ] quadrados", calcularQuantidadeItens(5)));

        System.out.println("\n---------------------------------\n");

        System.out.println(String.format("Alturar 1, Tem [ %s ] quadrados", calcularQuantidadeItensRecursivo(1)));
        System.out.println(String.format("Alturar 2, Tem [ %s ] quadrados", calcularQuantidadeItensRecursivo(2)));
        System.out.println(String.format("Alturar 5, Tem [ %s ] quadrados", calcularQuantidadeItensRecursivo(5)));
    }

    private static int calcularQuantidadeItens(int altura) {
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

    private static int calcularQuantidadeItensRecursivo(int altura) {
        if (altura == 0) {
            return 0;
        }

        if (altura == 1)  {
            return 1;
        }

        return (altura + calcularQuantidadeItensRecursivo(altura - 1));
    }
}
