#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a=2,b=3;
  cin>>n;  
  for(int i=1;i<=n;i++)
  {
    cout<<a<<" ";
    a=a+b;
    b=b*2;   
  }
}
