package chapterTwo;

public class SeparatingTheDigitsInAnInteger {
    public static String seperator(int integer) {
        int first = integer / 10000;
        int num1 = integer % 10000;
        int second = num1 / 1000;
        int num2 = num1 % 1000;
        int third = num2 / 100;
        int num3 = num2 % 100;
        int fourth = num3 / 10;
        int five = num3 % 10;

       return first +"   "+ second +"   "+ third + "   " + fourth + "   " + five;

    }
}
