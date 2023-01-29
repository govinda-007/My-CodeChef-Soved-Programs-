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
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int distance= Math.abs(a-b);
		    String ans= (distance%2 == 0)? "Yes" : "No";
		    System.out.println(ans);
		}
	}
}
