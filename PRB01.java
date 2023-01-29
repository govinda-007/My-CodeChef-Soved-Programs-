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
		    int ans=0;
		    for(int i=1;i<=n;i++){
		        if(n%i==0){
		            ans++;
		        }
		    }
		    if(ans==2){
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		}
	}
}
