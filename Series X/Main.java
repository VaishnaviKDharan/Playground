#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a=2;
  cin>>n;
  cout<<a<<" ";
  for(int i=1;i<n;i++)
  {
    a=(a*a)-1;
    cout<<a<<" ";
  }  
}
