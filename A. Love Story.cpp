#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    string s;
    string m = "codeforces"; 
    while(t--){
        cin>>s;
        int count = 0;
        for(int i = 0; i<m.size(); i++){
            if(s[i]!=m[i]){
                count++;
            }
        }
        cout<<count<<endl;
    }
    
    
}
