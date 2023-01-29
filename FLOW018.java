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
		    Long n,ans=1L;
		    n=in.nextLong();
		    for(int i=1;i<=n;i++){
		        ans*=i;
		    }
		    System.out.println(ans);
		}
	}
}
