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
		    int z=in.nextInt();
		    int y=in.nextInt();
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    if(z-y >= a+b+c){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
