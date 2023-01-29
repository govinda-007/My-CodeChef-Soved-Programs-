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
		    String hidden=in.next();
		    String guess=in.next();
		    String ans=" ";
		    int len=hidden.length();
		    for(int i=0;i<len;i++){
		        if(hidden.charAt(i)==guess.charAt(i)){
		            ans+='G';
		        }else{
		            ans+='B';
		        }
		    }
		    System.out.println(ans);
		}
	}
}
