package sec02.exam07;

public class FloatDoubleExample {
    public static void main(String[] args) {
        //float f1 = 3.14; // 실수 리터럴은 기본적으로 double 이다. double 리터럴을 float 변수에 담을 수 없다.

        float f2 = 3.14f;
        double d2 = 3.14;

        // 고정소수점 표현방식의 정밀도 확인
        float f3 = 0.123456789123456789f;
        double d3 = 0.123456789123456789;

        System.out.println("f2 = " + f2);
        System.out.println("d3 = " + d2);
        System.out.println("f3 = " + f3);
        System.out.println("d3 = " + d3);

        // 과학적 표기법 (지수 표현법)
        double d4 = 3e6;
        float f4 = 3e6f;
        double d5 = 2e-3;

        System.out.println("d4 = " + d4);
        System.out.println("f4 = " + f4);
        System.out.println("d3 = " + d3);
    }
}
