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
		    int n,ans=0;
		    n=in.nextInt();
		    int a[] = new int[n];
		    for(int i=0;i<n;i++){
		        a[i] = in.nextInt();
		        ans = Math.max(ans, a[i]);
		    }
		    System.out.println(ans);
		}
	}
}
