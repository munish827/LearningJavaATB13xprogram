package exe_01_Java_Basic;

public class Lab_59_NarrowingCasting {
    public static void main(String[] args) {
        int a = 300;
      //  byte b = a;// Narrowing casting - (invalid)Implictly not allowed
        byte b = (byte)a;//Narrowing casting - Explicitly allowed & here will be data loss
        System.out.println(b);
    }
}
