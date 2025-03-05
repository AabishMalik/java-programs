package regular;

import java.util.Scanner;
import java.math.*;

public class Scan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum_of_(n);

        sc.close();
    }


    public static void sum_of_(int n){

        int last_digit = n % 10;
        int first_digit = n;
        while (first_digit >= 10) {
            first_digit /= 10;
        }
        System.out.println("Sum of first and last digit is: " + (first_digit + last_digit));
    }

    

}
