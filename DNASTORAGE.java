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
		    String input = in.next();
		    for(int i=1;i<n;i=i+2){
		        if(input.charAt(i)=='0' && input.charAt(i-1)=='0'){
		            System.out.print("A");
		        }else if(input.charAt(i)=='1' && input.charAt(i-1)=='0'){
		            System.out.print("T");
		        }else if(input.charAt(i)=='0' && input.charAt(i-1)=='1'){
		            System.out.print("C");
		        }else if(input.charAt(i)=='1' && input.charAt(i-1)=='1'){
		            System.out.print("G");
		        }
		    }
		    System.out.println();
		}
	}
}
