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
		    if(x>y && x>z){
		        System.out.println("Setter");
		    }else if(y>x && y>z){
		        System.out.println("Tester");
		    }else{
		        System.out.println("Editorialist");
		    }
		}
	}
}
