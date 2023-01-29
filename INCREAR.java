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
		    int ans=0;
		    if(y>x){
		        ans=y-x;
		    }else{
		        int abs=Math.abs(x-y);
		        ans= (abs%2 ==0)? abs/2 : 2+(abs/2);
		    }
		    System.out.println(ans);
		}
	}
}
