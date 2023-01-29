#include <iostream>
using namespace std;

int main() {
    int t,n,c=10,v,d;
    cin>>t;
    while(t--)
    {
        cin>>n;
        d=n%10;
        v=n/c;
        if(d>0){
            cout<<v+1<<"\n";
        }
        else{
        cout<<v<<"\n";
        }
    }
	return 0;
}
