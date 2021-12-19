package dev.bstk.utils;

import java.io.PrintStream;

public class Console {

    private static final PrintStream PRINT_STREAM = new PrintStream(System.out);

    private Console() { }

    public static void log(final String format,
                           final Object ... args) {
        PRINT_STREAM.printf(format, args);
    }
}
