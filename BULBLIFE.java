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
		    int n=in.nextInt();
		    int x=in.nextInt();
		    int array[] = new int[n-1];
		    int sum=0;
		    for(int i=0;i<n-1;i++){
		        sum+=in.nextInt();
		    }
		    int ans= (n*x) - sum;
		    if(ans<0) ans=0; 
		    System.out.println(ans);
		}
	}
}
