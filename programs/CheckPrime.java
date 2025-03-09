package programs;

import java.util.ArrayList;

public class CheckPrime {

    public static void main(String[] args) {
        System.out.println(prime(7));
        System.out.println(prime(10));
        System.out.println(prime(11));
        System.out.println(prime(43));

        
    }   

    

    public static boolean prime(int n){

        Boolean[] arr = new Boolean[n+1];

        for (int i = 0; i <= n; i++) {
            arr[i] = true;
        }

        arr[0] = false;
        arr[1] = false;

    
        int i = 2;
        while (i*i <= n) {
            if (arr[i]) {
                int j = i*i;
                while (j <= n) {
                    arr[j] = false;
                    j += i;
                }
            }
            i++;
        }


        return arr[n];
    }
}
