#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float speed,dis,time;
  cin>>speed>>dis>>time;
  if(time>=((dis/speed)*60*60))
    cout<<"Yes";
  else
    cout<<"No";
}