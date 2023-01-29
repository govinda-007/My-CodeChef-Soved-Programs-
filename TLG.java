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
		int a,b,len=0,max=-1,sum1=0,sum2=0;
		while(t-- > 0){
		    a=in.nextInt();
		    b=in.nextInt();
		    sum1+=a;
		    sum2+=b;
		    if(Math.abs(sum1-sum2) > max){
		        max=Math.abs(sum1-sum2);
		        len=(sum1>sum2)?1:2;
		    }
		}
		System.out.println(len + " " + max);
	}
}
