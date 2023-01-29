#include <stdio.h>

int main(void) {
	int t,n,a[10];
	scanf("%d",&t);
	while(t--){
	    scanf("%d",&n);
	    int i=0;
	    while(n>0){
	        a[i]=n%10;
	        n=n/10;
	        i++;
	    }
	    printf("%d\n",a[0]+a[i-1]);
	}
	return 0;
}

