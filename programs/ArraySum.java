package programs;

public class ArraySum{
    public static void main(String[] args) {
        
    }

}

class Solution {
    public String average(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / arr.length;

        return String.format("%.2f", avg);
        
    }
}