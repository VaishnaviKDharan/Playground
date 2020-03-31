#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r1,r2,r3,car;
  cin>>r1>>r2>>r3>>car;
  if(r1%car==0)
    cout<<"Car 1 goes into road A";
  else if(r2%car==0)
    cout<<"Car 1 goes into road B";
  else if(r3%car==0)
    cout<<"Car 1 goes into road C";
  else
    cout<<"No path exist";
         
}