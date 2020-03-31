#include<iostream>
using namespace std;
class Operator
{
  public:
  int a1,a2,s1,s2,m1,m2,d1,d2;
  void read();
  int a,s,m,d;
  void op();
};
void Operator::op()
{
  a=a1+a2;
  cout<<a<<endl;
  s=s1-s2;
  cout<<s<<endl;
  m=m1*m2;
  cout<<m<<endl;
  d=d1/d2;
  cout<<d;
}
void Operator::read()
{
 cin>>a1>>a2>>s1>>s2>>m1>>m2>>d1>>d2;
}
int main()
{
  Operator O;
  O.read();
  O.op();
}
