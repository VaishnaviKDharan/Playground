#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a=4;
  cin>>n;
  cout<<a<<" ";
  for(int i=1;i<n;i++)
  {
    a=a+i*i;
    cout<<a<<" ";
  }
}
