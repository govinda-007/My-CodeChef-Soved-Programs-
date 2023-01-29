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
		    int a=1,b=1,c=1;
		    for(int i=2;i<=n/2;i++){
		        if(n%i == 0){
		            b=i;
		            break;
		        }
		    }
		    c=n/b;
		    if(a==b || b==c || c==a){
		        System.out.println(-1);
		    }else{
		        System.out.println(a+" "+b+" "+c);
		    }
		}
		
	}
}
