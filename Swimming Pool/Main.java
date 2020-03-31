#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int len,cap;
  cin>>len>>cap;
  if(cap<=(len*len*len*1000))
    cout<<"Can store";
  else
    cout<<"Cannot store";
}