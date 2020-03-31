#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,f=3,s=8,temp,i;
  cin>>num;
  cout<<f<<" "<<s<<" ";
  for(i=2;i<num;i++)
  {
    temp=f+s+i;
    cout<<temp<<" ";
    f=s;
    s=temp;
  }
}