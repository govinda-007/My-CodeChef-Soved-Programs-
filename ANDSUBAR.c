#include <stdio.h>
int main(void) {
	int T,N,k=1,s;
	scanf("%d",&T);
	while(T--)
	{
	    scanf("%d",&N);
	    while(k<=N)
	    {
	        k=k*2;
	        if(k>N){
	            k=k/2;
	            break;
	        }
	    }
	    s=N-k;
	    if(N==1 || N==2) printf("1\n");
	    else if((k/2)<=s) printf("%d\n",s+1);
	    else printf("%d\n",k/2);
	}
	return 0;
}

