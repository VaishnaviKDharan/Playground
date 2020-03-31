#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  //Type your code here.
  int t_balls,t_runs,no_runs,no_balls;
  cin>>t_balls>>t_runs>>no_runs>>no_balls;
  cout<<(float)t_balls/6<<endl;
  cout<<(float)((no_balls/6)+((no_balls%6)*0.1))<<endl;

  printf("%.1f\n",(no_runs/((no_balls/6)+((no_balls%6)*0.1))));
  printf("%.1f\n",t_runs/50.0);
  if((no_runs/((no_balls/6)+((no_balls%6)*0.1)))>=(t_runs/50.0))
    cout<<"Eligible to Win"<<endl;
  else
    cout<<"Not Eligible to Win"<<endl;
}
