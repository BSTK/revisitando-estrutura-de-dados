package dev.bstk.utils;

public class ConsoleUtils {

    private ConsoleUtils() { }

    public static void limpar() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
