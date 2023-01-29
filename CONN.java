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
		    int n=in.nextInt();
		    int mod7=n%7;
		    int mod5=mod7%2;
		    if(n<7){
		        if(mod5 == 0){
		            System.out.println("YES");
		        }else{
		            System.out.println("NO");
		        }
		    }else{
		        System.out.println("YES");
		    }
		}
	}
}
