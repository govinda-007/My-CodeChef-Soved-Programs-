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
		    int z=in.nextInt();
		    if((x+(z*2)) >= y){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
