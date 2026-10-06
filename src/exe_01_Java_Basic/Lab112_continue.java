package exe_01_Java_Basic;

public class Lab112_continue {
    public static void main(String[] args) {
        for(int i = 0 ; i<50 ; i++){
            if(i==5){
                continue; //it will skip the code and move to the next line
            }
            System.out.println(i);
        }
    }
}
