#include <stdio.h>

int main(void) {
	int t,a,b,c;
	scanf("%d",&t);
	while(t--){
	    scanf("%d%d%d",&a,&b,&c);
	    if(a+b==c || b+c==a || a+c==b){
	        printf("YES\n");
	    }else{
	        printf("NO\n");
	    }
	}
	return 0;
}

