import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t;
		t= in.nextInt();
		while(t-- > 0){
		    int m=in.nextInt();
		    int n=in.nextInt();
		    int k=in.nextInt();
		    String ans=(m>n*k)? "YES" : "NO";
		    System.out.println(ans);
		}
	}
}
