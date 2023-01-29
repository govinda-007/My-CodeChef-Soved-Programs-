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
	        int c=in.nextInt();
	        int ans=0;
	        for(int i=0;i<=20;i++){
	            double n=Math.pow(2,i);
	            if(n==a){
	                ans=(i*b)+(c*(i-1));
	                System.out.println(ans);
	            }
	        }
		}
	}
}
