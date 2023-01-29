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
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = in.nextInt();
		    }
		    int ans=0;
		    Arrays.sort(arr);
		    for(int i=0;i<n;i++){
		       if(i%2==0){
		           ans+=arr[i];
		       }else{
		           ans-=arr[i];
		       }
		    }
		    if(ans==0){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
		
	}
}
