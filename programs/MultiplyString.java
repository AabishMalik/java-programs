package programs;

import java.math.BigInteger;
import java.util.Scanner;

class Solution {
  public String multiply(String num1, String num2) {
    String s = num1 + " " + num2;
    Scanner sc = new Scanner(s);

    BigInteger n1 = new BigInteger(sc.next());
    BigInteger n2 = new BigInteger(sc.next());
    sc.close();

    BigInteger n3 = n1.multiply(n2);

    String res = String.valueOf(n3);

    return res;
  }
}

public class MultiplyString {}
