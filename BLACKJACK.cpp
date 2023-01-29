#include <iostream>
using namespace std;

int main() {
    int a,b,t,c;
    cin>>t;
    while(t--)
    {
        cin>>a>>b;
        c=21-(a+b);
        if(c>10){
            cout<<"-1\n";
        }
        else{
            cout<<c<<"\n";
        }
    }
    return 0;
}