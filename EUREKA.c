#include <stdio.h>
#include <math.h>
int main(void) {
	int t,n;
	float s,s1;
	scanf("%d",&t);
	while(t--){
	    scanf("%d",&n);
	    s=n*0.143;
	    s1=pow(s,n);
	    printf("%.0f\n",s1);
	}
	return 0;
}

