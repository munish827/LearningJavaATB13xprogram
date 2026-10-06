package exe_01_Java_Basic;

public class Lab93_JDK13above_arrowfuntion {
    public static void main(String[] args) {
        int a = 10;
        switch(a){
            case 10 -> System.out.println("1");
            //we can user arrow function in switch statement which allow user to write code without break
//work above jdk13 abocve
            case 11 -> System.out.println("2");
            case 12 -> System.out.println("3");
        }
    }
}
