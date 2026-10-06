package exe_01_Java_Basic;

public class Task13june {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        System.out.println("a:" + a + ",b:" +b);

        // Task 2
        int i = 1;

        i = i++ + ++i;

        System.out.println(i);

        //Task 3
        int x = 5;
        System.out.println(x++ + ++x);

        //Task4
        int j = 5;

        System.out.println(++j); // Output: ?

        System.out.println(j++); // Output: ?

        System.out.println(j);

        //Task 5
        int k = 5;

        int l = k++ + ++k;

        System.out.println("k: " + k); // Output: ?

        System.out.println("l: " + l); //
        //Task5
        int M = 5;

        int N = M++ + ++M + M++ + ++M;

        System.out.println("M = " + M + ", N = " + N);
    }
}
