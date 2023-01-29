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
		    int ans=Math.min(a,Math.min(b,c)) * Math.max(a,Math.max(b,c));
		    if(ans<0){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
