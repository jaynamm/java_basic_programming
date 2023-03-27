package sec03.test01;

public class test01 {
    public static void main(String[] args) {
        long var1 = 2L;
        float var2 = 1.8f;
        double var3 = 2.5;
        String var4 = "3.9";

        int result = (int) (var1 + var2 + var3 + (int) Double.parseDouble(var4));
        System.out.println("result = " + result);

        String str1 = 2 + 3 + "";
        System.out.println("str1 = " + str1);
        String str2 = 2 + "" + 3;
        System.out.println("str2 = " + str2);
        String str3 = "" + 2 + 3;
        System.out.println("str3 = " + str3);
    }
}
