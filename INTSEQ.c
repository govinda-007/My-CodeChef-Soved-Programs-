#include <stdio.h>

int main(void) {
	int t;
	scanf("%d",&t);
	while(t--){
	    int k,count=0;
	    scanf("%d",&k);
	    while(k%2 == 0){
	        count++;
	        k /= 2;
	    }
	    printf("%d\n",count);
	}
	return 0;
}

