package ua.hillel.sereda.lessons.lesson2;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
//        byte age;
//        age = 35;
        byte age = 35;
        short shortVarialbe = 32000;
        int intVariable = 2147000000;
        long longVariable = 21470000000000L;

//        System.out.println(age);

        float floatVariable = 1.123456789123456789F;
        double doubleVariable = 1.123456789123456789;
//        System.out.println(floatVariable);
//        System.out.println(doubleVariable);

        char charA1 = 'A';
        char charA2 = 65;
        char charA3 = '\u0041';
        char charZ = '\u0051';
        char charASpecial = '\u0104';
        char charZSpecial = '\u2323';

//        System.out.println(charA1);
//        System.out.println(charA2);
//        System.out.println(charA3);
//        System.out.println(charZ);
//        System.out.println(charASpecial);
//        System.out.println(charZSpecial);

        boolean isOK1 = true;
        boolean isOK2 = false;

//        System.out.println(isOK1);
//        System.out.println(isOK2);

       final double PI_VALUE = 3.14;

//        System.out.println(PI_VALUE);

        byte byteVariable = 55;
        int intTest = byteVariable;

//        System.out.println(byteVariable);
//        System.out.println(intTest);

        int intAge = 55;
        byte byteAge = (byte) intAge;

//        System.out.println(intAge);
//        System.out.println(byteAge);

        int intAge1 = 500;
        byte byteAge1 = (byte) intAge1;

//        System.out.println(intAge1);
//        System.out.println(byteAge1);

        String str = "Hello Word " +  555  +  " Java Best ";

//        System.out.println(str);

        String str1 = "Hello";
        String str2 = "Word";
        String str3 = "Java";
        String str4 = "Best";

        int number = 555;

        String Str = str1 + " " + str2 + " " + number + " " + str3 + " " + str4;
//        System.out.println(Str);



        double longitude = 30.6244794342468;
        double latitude = 50.4017043752658;

        char specSymbol ='\u00B0';

        System.out.println("longitude: - " + longitude + " latitude:" + latitude );
        System.out.println("DMC Lat: 50" + specSymbol + "24′25.251840000004712N " + " DMC Long:30" + specSymbol + "37′41.69856000000056E");

    }
}
