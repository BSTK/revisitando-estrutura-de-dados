package dev.bstk.utils;

public class StringUtils {

    private StringUtils() { }

    public static final String S = "S";
    public static final String N = "N";

    public static boolean isEmpty(final String valor) {
        return valor == null
            || valor.isEmpty()
            || valor.isBlank();
    }

    public static boolean isNotEmpty(final String valor) {
        return !isEmpty(valor);
    }

    public static boolean isSN(final String valor) {
        return isNotEmpty(valor)
            && (S.equalsIgnoreCase(valor) || N.equalsIgnoreCase(valor));
    }

    public static boolean isNotSN(final String valor) {
        return !isSN(valor);
    }

}
