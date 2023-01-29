#include <stdio.h>
int main(void) {
	int A,B,C,D,T,s,k=0,flag=0;
	scanf("%d",&T);
	for(int i=0;i<T;i++)
	{
	    scanf("%d%d%d%d",&A,&B,&C,&D);
	    if((A+B+C)<=D)
	    {
	        printf("1\n");
	    }
	    else if((A+C) <= D || (A+B) <= D)
	    {
	        printf("2\n");
	    }
	    else
	    {
	        printf("3\n");
	    }
	}
	return 0;
}

