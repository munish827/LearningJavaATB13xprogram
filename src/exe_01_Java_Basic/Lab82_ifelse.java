package exe_01_Java_Basic;

import java.util.Scanner;

public class Lab82_ifelse {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);
        if(age>18){
            System.out.println("You are allowed to vote");
        }else{
            System.out.println("You are not allowed to vote");
        }
    }
}
