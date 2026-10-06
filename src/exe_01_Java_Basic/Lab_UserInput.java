package exe_01_Java_Basic;

public class Lab_UserInput {
    public static void main(String[] args) {
        String age_strg = args[0];

       // int age = 20;
        System.out.println(age_strg);
        int age = Integer.parseInt(age_strg);
        String Myage = age>18?"your are eligible to vote":"You are not eligible to vote";
        System.out.println(Myage);
    }
}
