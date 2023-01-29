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
		    int b=in.nextInt();
		    int c=in.nextInt();
		    double min = Math.sqrt(Math.abs(Math.pow(b,2)-Math.pow(c,2)));
		    double max = Math.sqrt(Math.pow(b,2)+Math.pow(c,2));
		    System.out.println(min + " " + max);
		}
	}
}
