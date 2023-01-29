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
		    int m=in.nextInt();
		    int ans= Math.min(Math.abs(b-a),m-Math.abs(b-a));
		    System.out.println(ans);
		}
	}
}
