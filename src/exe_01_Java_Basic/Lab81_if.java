
package exe_01_Java_Basic;

import java.util.Scanner;

public class Lab81_if {
    public static void main(String[] args) {
        System.out.println("Enter the age");
           Scanner scanner = new Scanner(System.in);
               int age = scanner.nextInt();
            if(age>18){
                System.out.println("You are allowed to vote");
}
}
}