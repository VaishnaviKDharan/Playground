#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a=5;
  cin>>n;
  cout<<a<<" ";
  for(int i=3;i<n*2;i+=2)
  {   
    a=a+(11*(i-2));
    cout<<a<<" ";    
  }
}
