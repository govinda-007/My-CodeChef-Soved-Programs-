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
		    int n,k,x,y,ans;
		    n=in.nextInt();
		    k=in.nextInt();
		    x=in.nextInt();
		    y=in.nextInt();
		    if(x>y){
		        ans= (k * x) + (( n - k ) * y);
		    }else{
		        ans= ( k * x ) + (( n - k ) * x);
		    }
		    System.out.println(ans);
		}
	}
}
