#include <stdio.h>
#include <math.h>

void testcase()
{
    int n,num,rem,d,c=0,count=0;
    scanf("%d%d",&num,&d);
    n = num;
    while(n>0)
    {
        rem = n%10;
        n = n/10;
        c++;
        if(rem==d)
        {
            n = n*pow(10,c) + (rem+1)*pow(10,c-1);
            count = n-num;
            c = 0;
        }
    }
    printf("%d\n",count);
}

int main()
{
    int test;
    scanf("%d",&test);
    while(test--)
     testcase();
}