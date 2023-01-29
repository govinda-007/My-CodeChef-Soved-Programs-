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
		    int n;
		    n=in.nextInt();
		    String s= in.next();
		    String s1= in.next();
		    int count=0, count1=0;
		    for(int i=0;i<n;i++){
		        if(s.charAt(i) == '1' ){
		            count++;
		        }
		        if(s1.charAt(i) == '1'){
		            count1++;
		        }
		    }
		    int ans= Math.min(n/2,Math.min(count,count1));
		    System.out.println(ans);
		}
	}
}
