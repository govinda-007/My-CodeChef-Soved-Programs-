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
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    String ans="";
		    if(a<b && a<c){
		        ans="Draw";
		    }else if(b<a && b<c){
		        ans="Bob";
		    }else{
		        ans="Alice";
		    }
		    System.out.println(ans);
		}
	}
}
