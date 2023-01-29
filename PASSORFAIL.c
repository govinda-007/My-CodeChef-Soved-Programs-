#include <stdio.h>

int main(void) {
	int t,n,x,p,store;
	scanf("%d",&t);
	while(t--){
	    scanf("%d%d%d",&n,&x,&p);
	    store = (x*3) - (n-x);
	    if(p <= store)
	    {
	        printf("PASS\n");
	    }
	    else{
	        printf("FAIL\n");
	    }
	}
	return 0;
}

