package org.example;

public class CalculaMatriz {

    public static String somarVal(String a, String b) {
        int valueA = parseInt(a);
        int valueB = parseInt(b);

        return Integer.toString(valueA + valueB);
    }

    public static String subtrairVal(String a, String b) {
        int valueA = parseInt(a);
        int valueB = parseInt(b);

        return Integer.toString(valueA - valueB);
    }

    public static String multiplicarVal(String a, String b, String c, String d) {
        int valueA = parseInt(a);
        int valueB = parseInt(b);
        int valueC = parseInt(c);
        int valueD = parseInt(d);

        return Integer.toString((valueA * valueB) + (valueC * valueD));
    }

    public static String escalarVal(String a, String escalar) {
        int valueA = parseInt(a);
        int valueK = parseInt(escalar);

        return Integer.toString(valueA * valueK);
    }

    private static int parseInt(String value) {
        int intValue = 0;

        try {
            intValue = Integer.parseInt(value);
        } catch (Exception e) {
            System.out.println("O valor '" + value + "' é inválido. Tente Novamente.");
        }

        return intValue;
    }

}


