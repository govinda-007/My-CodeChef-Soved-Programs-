#include <stdio.h>

int main(void) {
	int n,t,rem,count=0;
	scanf("%d",&t);
	while(t--){
	    scanf("%d",&n);
	    while(n>0){
	        rem=n%10;
	        count=count+rem;
	        n=n/10;
	    }
	    printf("%d\n",count);
	    count=0;
	}
	return 0;
}

