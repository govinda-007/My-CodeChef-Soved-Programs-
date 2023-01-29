#include <stdio.h>

int main(void) {
	int t,n,x,k;
	scanf("%d",&t);
	while(t--){
	    scanf("%d%d%d",&n,&x,&k);
	    if(k>x){
	        printf("-1\n");
	    }else{
	        int c=0;
	        for(int i=0;i<n;i++){
	            if(c==k){
	                c=0;
	            }
	            printf("%d ",c);
	            c++;
	        }
	        printf("\n");
	    }
	}
	return 0;
}

