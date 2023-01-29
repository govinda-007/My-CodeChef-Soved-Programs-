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
		    int a[] = new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=in.nextInt();
		    }
		    for(int i=n-1;i>=0;i--){
		        if(a[i] != 0){
		            System.out.println(i);
		            break;
		        }
		    }
		}
	}
}
