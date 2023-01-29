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
		    int n,sum=0;
		    n=in.nextInt();
		    for(int i=0;i<n;i++){
		        sum += in.nextInt();
		    }
		    sum=Math.abs(sum);
		    if(sum%2 == 0){
		        System.out.println(sum/2);
		    }else{
		        System.out.println(-1);
		    }
		}
	}
}
