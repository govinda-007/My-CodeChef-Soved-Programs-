/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t;
		t= in.nextInt();
		while(t-- > 0){
		    int x,y;
		    x=in.nextInt();
		    y=in.nextInt();
		    String ans = (x>y)? "YES" : "NO";
		    System.out.println(ans);
		}
		
	}
}
