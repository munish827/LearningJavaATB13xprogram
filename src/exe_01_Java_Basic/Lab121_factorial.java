package exe_01_Java_Basic;

import java.util.Scanner;

public class Lab121_factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wel come to factorial program/Enter a number");
        if(!scanner.hasNextInt()){ //it is a prebuild function in java
            System.out.println("Enter an integer You fool");
            return;
        }
        int number = scanner.nextInt();
        int factorial = 1 ;
        if(number<0){
            System.out.println("Please enter a postive number");
        }
        if(number<=0){
            System.out.println(number);
        }else{
            for(int i = 1; i<=number; i++){
                factorial = factorial * i;
            }
        }
        System.out.println(factorial);
    }
}
