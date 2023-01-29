#include <stdio.h>

int main(void) {
	int t,n,d=97;
	scanf("%d",&t);
	while(t--){
	    scanf("%d",&n);
	    while(n>0){
	        printf("%c",d);
	        d++;
	        if(d == 123){
	            d=97;
	        }
	        n -= 1;
	    }
	    printf("\n");
	}
	return 0;
}

