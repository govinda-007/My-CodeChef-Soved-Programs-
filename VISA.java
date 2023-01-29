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
		    int x1=in.nextInt();
		    int x2=in.nextInt();
		    int y1=in.nextInt();
		    int y2=in.nextInt();
		    int z1=in.nextInt();
		    int z2=in.nextInt();
		    if(x1<=x2 && y1<=y2 && z1>=z2){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
