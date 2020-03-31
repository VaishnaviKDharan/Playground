#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a,c=0,sum=0;
  cin>>n;
  while(true)
  {
    cin>>a;
    c++;
    sum+=a;
    if(sum>=n)
    {
      break;
    }}
  cout<<"The number of turns is "<<c<<endl;
    
}
