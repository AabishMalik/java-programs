package programs;

public class DaysBeforeN {
    public static void main(String[] args) {
        System.out.println(nthDay(2, 19));

    }

    public static int nthDay(int d, int n) {
        n = n % 7;
        d = d - n;
        return (d < 0) ? 7 + d : d;
    }
}
