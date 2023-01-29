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
		    int sn=n, ans=0;
		    while(n>0){
		        int r=n%10;
		        ans= (ans*10) + r;
		        n=n/10;
		    }
		    if(sn==ans){
		        System.out.println("wins");
		    }else{
		        System.out.println("loses");
		    }
		}
	}
}
