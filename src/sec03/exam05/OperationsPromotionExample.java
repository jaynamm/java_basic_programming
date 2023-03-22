package sec03.exam05;

public class OperationsPromotionExample {
    public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;

        int intValue = byteValue1 + byteValue2;
        System.out.println("intValue = " + intValue);

        char charValue1 = 'A';
        char charValue2 = 1;

        int intValue2 = charValue1 + charValue2;
        System.out.println("intValue2 유니코드 = " + intValue2);
        System.out.println("intValue2 출력 문자 = " + (char) intValue2);
     
        int intValue3 = 10;
        int intvlaue4 = intValue3 / 4; // 파이썬이었다면 float 타입으로 반환
        System.out.println("intvlaue4 = " + intvlaue4);

    }
}
