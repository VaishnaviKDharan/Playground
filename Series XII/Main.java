#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a=9,b=11,d;
  cin>>n;
  if(n==1)
  cout<<a<<" ";
   else if(n==2)
     cout<<a<<" "<<b<<" ";
else
     cout<<a<<" "<<b<<" ";
  for(int i=2;i<n;i++)
  {
     d=a+b;
    cout<<d<<" ";
    a=b;
    b=d;
  }
  
}
