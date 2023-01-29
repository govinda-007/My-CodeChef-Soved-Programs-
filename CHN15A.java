/*G̶̢͓͚͍̝͙̠̞̐̒͆͝O̴̭͍̯̹̼̾͛̀̌̊́̈́͌V̴̧̬̯̋͒̈̾ͅĮ̸̛̪͔̖̦̲̘͔͖͆̑͗̎̚Ṇ̴̪̱͍̪̪̜͉͂̋̈͌D̴̼̖͎̲̘́͑͌̿̂́͜͝͝ ̷̢͓͙̜̯̟̂̉͘V̵̲̠̫̦͚̱̻̱̊̀͒̃͘͝͝Y̵̮̳̖̰̙͆͗͆A̴̛̜͖̐̓̈́̀́͐̒̚̕S̸̲͇̻̭̹͗ ̶̢͖̘̲̞͉̦̣̐͛̀̈́̂͌̾ͅ(̵̥͍͋P̶̢̨̼̥͓̭̱͒Ŗ̶̢̭͍̱̯̞̻͒I̵͈̪̞͚̯̋̈́̔̋͂́̚̕N̸̢͈̘͒̄Č̸̢̡̬̙̫̘͉͓̪̝̌͝͠E̶̯͔̳̿͌̎̿͑)̵̢̨͍̗̜̯̝͔͉̍̎̓*/
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
		    int n,k;
		    n=in.nextInt();
		    k=in.nextInt();
		    int a[] = new int[n];
		    for(int i=0;i<n;i++){
		        a[i] = in.nextInt();
		    }
		    int count=0;
		    for(int i:a){
		        if((i+k) % 7 == 0){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
