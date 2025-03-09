package programs;

public class HashMapArray {
    
}


class Solution{
    static int map(int n, String keys[], int arr[], String s)
    {
        for (int i=0; i< n; i++){
            if ( keys[i].equals(s)   ){
                return arr[i];
            }
        }
        return -1;
    }
}