#include<stdio.h>
#include<stdlib.h>
int main()
{
    int t,x,y,count=0;
    scanf("%d",&t);
    while(t--){
        scanf("%d%d",&x,&y);
        int n=y-x;
        if (x == y) printf("0\n");
		else if (x < y)
		{
			if (n % 2 == 0) 
			{
			    printf("%d\n",n/2);
			}
			else{
			    printf("%d\n",(n / 2) + 2);
			}
		}
		else{
		    printf("%d\n", -1 * n);
		}
    }
}