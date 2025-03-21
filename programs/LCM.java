package programs;

import java.util.ArrayList;

public class LCM{
    public static void main(String[] args) {
        System.out.println(lcm(4, 6));
        System.out.println(lcm(5, 10));
        System.out.println(lcm(7, 9));
        System.out.println(lcm(8, 12));
        System.out.println(lcm(10, 15));
        System.out.println(lcm(20, 12));
        System.out.println(lcm(19 , 38));

        
    }


    public static int lcm(int a, int b){
        int m = Math.max(a, b);
        int n = Math.min(a, b);

        int i = 1;
        while (true) {
            if ((m*i) % n == 0) {
                return m*i;
            }
            i++;
        }
    }

}