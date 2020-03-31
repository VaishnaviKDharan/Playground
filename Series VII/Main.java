#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a=1,b=2;
  cin>>n;
  cout<<a<<" "<<b<<" ";
  for(int i=3;i<=n;i++)
  {
    if(i%2!=0)
    {  a=a*3;
    cout<<a<<" ";
    }
    else
    {
      b=b*3;
      cout<<b<<" ";
    }    
  }
}
