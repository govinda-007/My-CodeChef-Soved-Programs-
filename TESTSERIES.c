#include <stdio.h>

int main(void) {
	int t,R[10],india=0,england=0;
	scanf("%d",&t);
	while(t--){
	    for(int i=0;i<5;scanf("%d",&R[i++]));
	    for(int i=0;i<5;i++)
	    {
	        if(R[i]==1)
	        {
	            india++;
	        }
	        else if(R[i]==2){
	            
	            england++;
	        }
	    }
	    if(india > england )
	    {
	        printf("INDIA\n");
	    }
	    else if(england > india)
	    {
	        printf("ENGLAND\n");
	    }
	    else if(india == england){
	        printf("DRAW\n");
	    }
	    india=0;
	    england=0;
	}
	return 0;
}

