package hw1;

public class DataTypes {

    public static void main(String[] args) {
        // HW 5 : multiplication by byte data type, Byte range is -128 to 127
        byte a =127;
        byte b =96;
        System.out.println(a*b);

        // addition by Short data type, Short range is -32768 to 32767
        short c =32766;
        short d =5576;
        System.out.println(c+d);

        //subtraction by int data type, Int rang is -2,147,483,648 to 2,147,483,647
        int e =2147483647;
        int f =1167998989;
        System.out.println(e-f);

        //division by long data type,
        long g =187387498787498L;
        long h =12929128838310L;
        System.out.println(g/h);

        // increment operator/ Unary operators
        double j = 65.676;
        float k = 435;
        System.out.println(j++);
        System.out.println(j++);
        System.out.println(k--);
        System.out.println(k--);



    }
}

