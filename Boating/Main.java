#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int stable,adult,child;
  cin>>stable>>adult>>child;
  int present = (adult*75)+(child*30);
  if(stable>=present)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}