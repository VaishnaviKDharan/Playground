#include<iostream>
using namespace std;
class Electricity_Bill
{
  public:
  int n,u;
  string s;
  void read();
  int q,f,c;
  void op();
};
void Electricity_Bill::op()
{
  cout<<n<<endl<<s<<endl<<u<<endl;
  if(u<=100)
  {
    q=u*1.20;
    cout<<q;
  }
  else if(u<=300)
  {
    u-=100;
    u*=2;
    c=u+120;
    cout<<c;
  }
  else
  {
    u-=300;
    u*=3;
    f=u+360;
    cout<<f;
  }
}
void Electricity_Bill::read()
{
 cin>>n>>s>>u;
}
int main()
{
  Electricity_Bill b;
  b.read();
  b.op();
}
