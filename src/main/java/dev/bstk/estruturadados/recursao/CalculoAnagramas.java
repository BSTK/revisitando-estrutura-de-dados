package dev.bstk.estruturadados.recursao;

public class CalculoAnagramas {

    private static char[] caracteres = new char[100];
    private static int quantidadeCaracteres = 0;

    public static void calcularAnagrama(int tamanho) {
        if (tamanho == 1) {
            return;
        }

        for (int i = 0; i < tamanho; i++) {
            calcularAnagrama(tamanho - 1);

            if (tamanho == 2) {
                mostrarPalavrasAnagrama();
            }

            rotacionarPalavra(tamanho);
        }
    }

    private static void rotacionarPalavra(int tamanho) {
        int j;
        int posicao = (quantidadeCaracteres - tamanho);
        char caratereTemp = caracteres[posicao];

        for (j = (posicao + 1); j < quantidadeCaracteres; j++) {
            caracteres[j - 1] = caracteres[j];
        }

        caracteres[j - 1] = caratereTemp;
    }

    private static void mostrarPalavrasAnagrama() {

    }
}
