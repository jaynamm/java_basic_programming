package sec03.exam07;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);

        String str1 = String.valueOf(value1);

        int intValue = 10;
        char charValue = 'A';
        double doubleVlaue = 5.7;
        String strValue = "A";

        double var1 = (double) intValue;
        byte var2 = (byte) intValue;
        int var3 = (int) doubleVlaue;
//        char var4 = (char) strValue; 정답

        int x = 5;
        int y = 2;
        int result = x / y;
        System.out.println("result = " + result);

    }
}
