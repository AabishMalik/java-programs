package programs;

public class DecisionMaking{

    public void main(String[] args){

    }

}



class Solution{
    public static String compareNM(int n, int m){
        if (n > m){
            return "greater";
        }else if (n < m){
            return "lesser";
        }else{
            return "equal";
        }
    }
}