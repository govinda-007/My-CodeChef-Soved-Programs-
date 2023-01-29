/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
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
		    int a[] = new int[n];
		    int b[] = new int[n];
		    for(int i=0;i<n;i++){
		        a[i] = in.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        b[i] = in.nextInt();
		    }
		    int count=0;
		    int maxcount=-1;
		    for(int i=0;i<n;i++){
		        if(a[i]!=0 && b[i]!=0){
		            count++;
		        }else{
		            count=0;
		        }
		        maxcount = Math.max(maxcount,count);
		    }
		    System.out.println(maxcount);
		}
		
	}
}
