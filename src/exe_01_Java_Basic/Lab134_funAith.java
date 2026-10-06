package exe_01_Java_Basic;

import java.util.Scanner;

public class Lab134_funAith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = 0;
        if(scanner.hasNextInt()){
            a = scanner.nextInt();
        }else{
            System.out.println("please enter a integer");
            return;
        }
        System.out.println("Please enter another number");
        int b = 0;
        if(scanner.hasNextInt()){
            b = scanner.nextInt();
        }else{
            System.out.println("please enter a integer");
            return;
        }
    int  result =    result_sum(a,b);
        System.out.println(result);
    }
    static int result_sum(int a,int b){
        return a+ b;

    }
}
