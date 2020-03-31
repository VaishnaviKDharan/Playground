#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int first,last,age;
  cin>>first>>last;
  if(last==00)
  {
    last=100;
    age=last-first;
  }
  else if(last>=first)
  {
    age=last-first;
  }
  else if(first>last)
  {
    age=(100-first+last);
  }
  cout<<age;
}