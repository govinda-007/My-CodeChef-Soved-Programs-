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
		    int a[] = new int[7];
		    int count=0;
		    for(int i=0;i<7;i++){
		        a[i]=in.nextInt();
		        if(a[i] == 0){
		            count++;
		        }
		    }
		    String ans=  (count<4)? "YES" : "NO";
		    System.out.println(ans);
		}
	}
}
