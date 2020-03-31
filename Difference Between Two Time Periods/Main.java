#include<iostream>
using namespace std;
struct time{
int h,m,s;
};
int main()
{
  struct time t1,t2,t3;
  cin>>t1.h>>t1.m>>t1.s;
  cin>>t2.h>>t2.m>>t2.s;
  t3.s=t1.s-t2.s;
  if(t3.s<0){
    t1.m--;
    t3.s+=60;
  }
   t3.m=t1.m-t2.m;
   if(t3.m<0){
    t1.h--;
    t3.m+=60;
  }
t3.h=t1.h-t2.h;
  cout<<t3.h<<":"<<t3.m<<":"<<t3.s;
}
