#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z;
  string s;
  cin>>x>>y>>z>>s;
 
  if(s=="L1")
  {
    if(y<z)
      cout<<"L2";
    else
      cout<<"L3";
  }
   else if(s=="L2")
  {
    if(x<z)
      cout<<"L1";
    else
      cout<<"L3";
  }
   else if(s=="L3")
  {
    if(x<y)
      cout<<"L1";
    else
      cout<<"L2";
  }
  else
    cout<<"Invalid ";
}