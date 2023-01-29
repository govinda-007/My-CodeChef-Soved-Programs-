#include <iostream>
#include <bits/stdc++.h>
#define ll long long int
#define mod ll(1e9+7)
using namespace std;
void Luffy()
{
    int n,max= 0,flag=0;
    cin>>n;
    int arr[n];
    vector<int>freq ;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    for(int i=0;i<n;i++){
        int count=1;
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        freq.push_back(count);
    }
    sort(freq.begin(),freq.end());
    int k=freq.size();
    if(freq[k-1] == freq[k-2]){
        cout<<"No"<<endl;
    }else{
        cout<<"Yes"<<endl;
    }
    
}
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
    ll t; cin>>t;
    while(t--)
        Luffy();
}