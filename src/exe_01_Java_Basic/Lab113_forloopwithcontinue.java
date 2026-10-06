package exe_01_Java_Basic;

public class Lab113_forloopwithcontinue {
    public static void main(String[] args) {
        for(int i = 0; i<50 ; i++){
            if(i%2==0){
                continue;
            }
            System.out.println("This is a odd number =" + i);
        }
    }
}
