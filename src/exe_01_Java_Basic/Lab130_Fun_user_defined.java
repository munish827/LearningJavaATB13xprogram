package exe_01_Java_Basic;

public class Lab130_Fun_user_defined {
    public static void main(String[] args) {

fun1();//function call 1
String Myfun2 = fun2();//function call 2
        System.out.println(Myfun2);
        fun3(55,"raju");

        int result = sumfun4(4,5);
        System.out.println(result);
    }
    //Type 1:-Function without parameters and return type
    static void fun1(){
        System.out.println("  Function Type 1-:This is aFunction without parameters and return type");
    }
    //Type 2:-Function without parameter but with return type
    static String fun2(){
        return "Function Type 2:-hi this is function withot parameter but with return type";
    }
    //Type 3 :- Function with parameter without return type
    static void fun3(int age,String name){
        System.out.println(age+name);

    }
    //Type 4 :- Function with parameter & return type
    static int sumfun4(int a , int b){
        return a+b;
    }

}
