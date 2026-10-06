package exe_01_Java_Basic;

public class Lab_66_NestedTernary {
    public static void main(String[] args) {
        int a = 66;
        String age = a<18?"Adult":(a<65?"Adult":"Senior Citizen");
        System.out.println(age);
    }
}
