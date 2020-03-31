#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,team;
  cin>>num>>team;
  cout<<"The number of students in each team is "<<(num/team)<<" and left out is "<<(num%team);
}