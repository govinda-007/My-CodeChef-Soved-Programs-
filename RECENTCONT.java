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
		    String s[] = new String[n];
		    for(int i=0;i<n;i++){
		        s[i]=in.next();
		    }
		    int st38=0, st108=0;
		    for(int i=0;i<n;i++){
		        if(s[i].equals("START38")){
		            st38++;
		        }else{
		            st108++;
		        }
		    }
		    System.out.println(st38 + " " + st108);
		}
	}
}
