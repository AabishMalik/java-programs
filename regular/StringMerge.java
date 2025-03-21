package regular;

import java.util.Scanner;

class Solution{
    public static String mergeAlternatively(String s1, String s2){
        StringBuilder sb = new StringBuilder();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        int i1 = 0, i2 = 0;

        while(i1 < c1.length || i2 < c2.length){
            if (i1 < c1.length && i1 <= i2){
                sb.append(c1[i1++]);
            }
            if (i2 < c2.length && i2 <= i1){
                sb.append(c2[i2++]);
            }
        }


        return sb.toString();
    }

}

public class StringMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string 2: ");
        String s2 = sc.nextLine();

        sc.close();

        System.out.println(Solution.mergeAlternatively(s1, s2));
        
    }
}

