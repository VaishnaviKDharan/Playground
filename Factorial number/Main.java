#include<iostream>
using namespace std;
class Factorial 
{
  public:
  int n;
  void read();
  int fact;
  void op();
};
void Factorial::op()
{
 fact=1;
  for(int i=1;i<=n;i++)
    fact=fact*i;
  cout<<fact;
}
void Factorial::read()
{
 cin>>n;
}
int main()
{
  Factorial f;
  f.read();
  f.op();
}
