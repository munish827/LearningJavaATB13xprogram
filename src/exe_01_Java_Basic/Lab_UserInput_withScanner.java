package exe_01_Java_Basic;

import java.util.Scanner;

public class Lab_UserInput_withScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age12");
        int age = scanner.nextInt();
        String vote = age>18?"yes":"No";
        System.out.println(vote);
    }
}
