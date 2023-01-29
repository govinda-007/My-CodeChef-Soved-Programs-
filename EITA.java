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
		    //7-d * z + d*y
		    //7 * x
		    int d=in.nextInt();
		    int x=in.nextInt();
		    int y=in.nextInt();
		    int z=in.nextInt();
		    int ans=Math.max((((7-d)*z)+d*y),7*x);
		    System.out.println(ans);
		}
	}
}
