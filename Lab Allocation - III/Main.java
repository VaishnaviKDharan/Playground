#include<iostream>
using namespace std;
int main()												
{
  //Type your code here
  int  a[3],count=0;
  for(int i=0;i<4;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<3;i++)
  {
    if(a[3]<a[i])
      count++;
 }
  cout<<count;
}
