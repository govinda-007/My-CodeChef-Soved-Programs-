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
		    int x=in.nextInt();
		    int y=in.nextInt();
		    int distance= Math.abs(x-y);
		    if(distance%2==0){
		        System.out.println(distance/2);
		    }else{
		        System.out.println((distance/2)+1);
		    }
		}
	}
}
