package dev.bstk.ordenacao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class AlgoritmoBubbleSort {

    private static final Logger LOGGER = LoggerFactory.getLogger(AlgoritmoBubbleSort.class);

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        long[] dataset10 = RANDOM.longs(10, 0, 1_000).toArray();
        long[] dataset30 = RANDOM.longs(30, 0, 1_000).toArray();
        long[] dataset50 = RANDOM.longs(50, 0, 1_000).toArray();

        executar(dataset10);
        executar(dataset30);
        executar(dataset50);
    }

    private static void executar(long[] dataset) {
        LOGGER.info("dataset.length = [ {} ]", dataset.length);

        for (int i = 0; i < dataset.length; i++) {
            for (int j = 0; j < dataset.length - 1; j++) {
                if (dataset[j] > dataset[j + 1]) {
                    long auxiliar = dataset[j];
                    dataset[j] = dataset[j + 1];
                    dataset[j + 1] = auxiliar;
                }
            }
        }

        for (int i = 0; i < dataset.length; i++) {
            LOGGER.info("[ {}º ][ {} ]", i, dataset[i]);
        }

        LOGGER.info("\n");
    }
}
