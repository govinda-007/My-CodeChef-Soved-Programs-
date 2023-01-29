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
		    int x1,x2,y1,y2;
		    x1=in.nextInt();
		    y1=in.nextInt();
		    x2=in.nextInt();
		    y2=in.nextInt();
		    double c_to_a = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
            double c_to_b = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
            if (c_to_a > c_to_b) {
                System.out.println("ALEX");
            } else if (c_to_b > c_to_a) {
                System.out.println("BOB");
            } else {
                System.out.println("EQUAL");
		    }
		}
	}
}
