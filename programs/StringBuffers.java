package programs;

public class StringBuffers{
    public static void main(String[] args) {
	String s1 = "s";
	String s2 = "s";
	String s3 = new String("s");
	System.out.println(s1 == s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1 == s3);
	System.out.println(s1.equals(s3));
    }
}
