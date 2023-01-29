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
		    int x,y,z;
		    x=in.nextInt();
		    y=in.nextInt();
		    z=in.nextInt();
		    int count = y/z;
		    if(y%z != 0) count++;
		    int ans = count * x;
		    System.out.println(ans);
		}
	}
}
