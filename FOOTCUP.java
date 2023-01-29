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
		    if((x>0 && y>0) && (x==y)){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
