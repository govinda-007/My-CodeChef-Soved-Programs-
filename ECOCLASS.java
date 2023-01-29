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
		    int n = in.nextInt();
		    int s[] = new int[n];
		    int d[] = new int[n];
		    for(int i=0;i<n;i++){
		        s[i]=in.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        d[i]=in.nextInt();
		    }
		    int count=0;
		    for(int i=0;i<n;i++){
		        if(s[i] == d[i]){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
