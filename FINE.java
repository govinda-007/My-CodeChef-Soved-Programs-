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
		    int x;
		    x=in.nextInt();
		    int ans=0;
		    if(x<=70){
		        ans=0;
		    }else if(x>70 && x<=100){
		        ans=500;
		    }else if(x>100){
		        ans=2000;
		    }
		    System.out.println(ans);
		}
	}
}
