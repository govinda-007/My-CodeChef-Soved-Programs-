#include <stdio.h>

int main(void) {
	int t,x;
	scanf("%d",&t);
	while(t--){
	    scanf("%d",&x);
	    if(x>0 && x<100)
	    {
	        printf("Easy\n");
	    }
	    else if(x>=100 && x<200)
	    {
	        printf("Medium\n");
	    }
	    else{
	        printf("Hard\n");
	    }
	}
	return 0;
}

