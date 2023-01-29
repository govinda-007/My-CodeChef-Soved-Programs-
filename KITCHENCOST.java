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
		    int n,x;
		    n=in.nextInt();
		    x=in.nextInt();
		    int a[] = new int[n];
		    int b[] = new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=in.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        b[i]=in.nextInt();
		    }
		    int ans=0;
		    for(int i=0;i<n;i++){
		        if(a[i]>=x){
		            ans+=b[i];
		        }
		    }
		    System.out.println(ans);
		}
	}
}
