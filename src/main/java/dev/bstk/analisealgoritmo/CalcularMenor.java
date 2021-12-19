package dev.bstk.analisealgoritmo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class CalcularMenor {

    private static final Logger LOGGER = LoggerFactory.getLogger(CalcularMenor.class);

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        long[] datasetMenor = RANDOM.longs(100, 0, 100_000_000).toArray();
        long[] datasetMaior = RANDOM.longs(100, 0, 100_000_000).toArray();
        long[] datasetMenorMaior = RANDOM.longs(100, 0, 100_000_000).toArray();

        LOGGER.info("Menor: [ {} ]\n", calcularMenor(datasetMenor));
        LOGGER.info("Maior: [ {} ]\n", calcularMaior(datasetMaior));

        long[] menorMaior = calculaMenorMaior(datasetMenorMaior);
        LOGGER.info("Menor: [ {} ] Maior: [ {} ]\n", menorMaior[0], menorMaior[1]);
    }

    private static long calcularMenor(long[] dataset) {
        LOGGER.info("CalcularMenor() - Tamanho Datase: [ {} ]", dataset.length);

        long menor = dataset[0];

        for (long item : dataset) {
            if (item < menor) {
                menor = item;
            }
        }

        return menor;
    }

    private static long calcularMaior(long[] dataset) {
        LOGGER.info("CalcularMaior() - Tamanho Datase: [ {} ]", dataset.length);

        long maior = dataset[0];

        for (long item : dataset) {
            if (item > maior) {
                maior = item;
            }
        }

        return maior;
    }

    private static long[] calculaMenorMaior(long[] dataset) {
        LOGGER.info("CalculaMenorMaior() - Tamanho Datase: [ {} ]", dataset.length);

        long menor = dataset[0];
        long maior = dataset[0];

        for (long item : dataset) {
            if (item < menor) { menor = item; }
            if (item > maior) { maior = item; }
        }

        return new long[]{menor, maior};
    }
}
