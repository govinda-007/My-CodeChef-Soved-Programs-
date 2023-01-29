#include <stdio.h>

int main(void) {
	int t,A,B,C;
	scanf("%d",&t);
	while(t--){
	    scanf("%d%d%d",&A,&B,&C);
	    if(A==7 || B==7 || C==7)
	    {
	        printf("YES\n");
	    }
	    else{
	        printf("NO\n");
	    }
	}
	return 0;
}

