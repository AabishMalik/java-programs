package programs;

public class HCF {

    public static void main(String[] args) {
        System.out.println(hcf(5, 10));
    }

    public static int hcf(int a, int b){
        int hcf = 1;

        int i = 2;
        while ( i <= a && i <= b) {
            while ( (a%i ==0) && (b%i == 0)){
                hcf *= i;
                a /= i;
                b /= i;
            }
            i++;
        }
        return hcf;
    }
    
}
