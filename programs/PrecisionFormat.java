package programs;

import java.util.ArrayList;

public class PrecisionFormat {

    public static void main(String[] args) {
        System.err.println(Solution.divisionWithPrecision(5.43f, 2.653f));
        
    }
    
}

class Solution{
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        float n = a/b;
        ArrayList<Float> arr = new ArrayList<Float>();
        arr.add(n);
        arr.add((float) Math.round(n*1000)/1000);
        
        return arr;
    }
}
