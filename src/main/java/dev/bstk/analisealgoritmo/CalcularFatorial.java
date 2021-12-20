package dev.bstk.analisealgoritmo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalcularFatorial {

    private static final Logger LOGGER = LoggerFactory.getLogger(CalcularFatorial.class);

    public static void main(String[] args) {
        LOGGER.info("Fatorial(4)   = [ {} ]", fatorial(4));
        LOGGER.info("FatorialII(4) = [ {} ]", fatorialRecursao(4));
        LOGGER.info("Fatorial(6)   = [ {} ]", fatorial(7));
        LOGGER.info("FatorialII(6) = [ {} ]", fatorialRecursao(7));
    }

    /** Normal **/
    private static long fatorial(long n) {
        long resultado;

        if (n == 0 || n == 1) {
            resultado = 1;
        } else {
            resultado = n * fatorial(n - 1);
        }

        return resultado;
    }

    /** Com recursão **/
    private static long fatorialRecursao(long n) {
        return (n == 0 || n == 1) ? 1 : n * fatorialRecursao(n - 1);
    }
}
