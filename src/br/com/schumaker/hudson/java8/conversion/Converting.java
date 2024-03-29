package br.com.schumaker.hudson.java8.conversion;

public class Converting {

    private static final String TO_INT = "453";
    private static final String TO_LONG = "45234223233";
    private static final String TO_FLOAT = "45.823F";
    private static final String TO_DOUBLE = "13.83423D";
    private static final String WRONG_NUMBER = "452w";

    public static void main(String... args) {
        // primitive types
        int toInt = Integer.parseInt(TO_INT);
        long toLong = Long.parseLong(TO_LONG);
        float toFloat = Float.parseFloat(TO_FLOAT);
        double toDouble = Double.parseDouble(TO_DOUBLE);

        // Object types
        Integer toIntObj = Integer.valueOf(TO_INT);
        Long toLongObj = Long.valueOf(TO_LONG);
        Float toFloatObj = Float.valueOf(TO_FLOAT);
        Double toDoubleObj = Double.valueOf(TO_DOUBLE);

        try {
            Integer toIntWrong1 = Integer.valueOf(WRONG_NUMBER);
        } catch (NumberFormatException e) {
            System.err.println(e);
            // handle exception
        }

        try {
            int toIntWrong2 = Integer.parseInt(WRONG_NUMBER);
        } catch (NumberFormatException e) {
            System.err.println(e);
            // handle exception
        }
    }
}
