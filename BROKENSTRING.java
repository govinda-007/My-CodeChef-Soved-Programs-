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
		    String s=in.next();
		    String a=s.substring(0,n/2);
		    String b=s.substring(n/2,n);
		    String ans=b+a;
		    if(s.equals(ans)){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		    
		}
	}
}
