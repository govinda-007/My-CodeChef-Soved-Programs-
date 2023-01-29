#include <stdio.h>

int main(void) {
	int t,k,c,d,p;
	scanf("%d",&t);
	while(t--){
	    scanf("%d",&k);
	    c=52/k;
	    d=c*k;
	    p=52-d;
	    printf("%d\n",p);
	}
	return 0;
}

