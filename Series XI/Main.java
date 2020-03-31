#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float a=95.0,b=20.5;
  cin>>n;
  cout<<a<<" ";
  for(int i=1;i<n;i++)
  {
    a=(float)a+b;
    b=b+2;
    cout<<(float)a<<" ";
  
  }
}
