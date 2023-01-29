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
		    int x,y,k;
		    x=in.nextInt();
		    y=in.nextInt();
		    k=in.nextInt();
		    int ans= Math.abs(x-y) / k;
		    if(Math.abs(x-y) % k !=0) ans++;
		    System.out.println(ans);
		}
	}
}
