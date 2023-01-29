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
		    int a,b,c,s=0;
		    a=in.nextInt();
		    b=in.nextInt();
		    c=in.nextInt();
		    for(int i=1;i<100;i++){
		        if(a%i == 0 || b%i==0 || c%i==0){
		            continue;
		        }else{
		            s=i;
		            break;
		        }
		    }
		    System.out.println(s);
		}
		
	}
}
