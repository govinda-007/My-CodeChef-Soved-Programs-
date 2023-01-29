/*G✵O✵V✵I✵N✵D✵ V✵Y✵A✵S✵ (P✵R✵I✵N✵C✵E✵)*/
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
		    int a,b,c;
		    a=in.nextInt();
		    b=in.nextInt();
		    c=in.nextInt();
		    int ans= (a+b+c) - (Math.min(a,Math.min(b,c)));
		    System.out.println(ans);
		}
	}
}
