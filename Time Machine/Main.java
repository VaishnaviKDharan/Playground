#include<iostream>
using namespace std;
class Machine
{
  public:
  int h[2],m[2],s[2];
  int a,b,c;
  void time();
  void add();
};
void Machine::time()
{
  for(int i=0;i<2;i++)
  {
    cout<<"Enter time:"<<endl<<"Hours :"<<endl;cin>>h[i];
    cout<<"Minutes :"<<endl;cin>>m[i];
    cout<<"Seconds :"<<endl;cin>>s[i];
  }
}
void Machine::add()
{
  a=0,b=0,c=0;
  for(int i=0;i<2;i++)
  {
   a+=h[i];
   b+=m[i];
   if(b>=60)
   {
    a++;
    b-=60;
   }
   c+=s[i];
   if(c>=60)
   {
    b++;
    c-=60;
   }
 }
 cout<<"Time after add: "<<a<<":"<<b<<":"<<c;
}
int main()
{
 Machine M;
  M.time();
  M.add();
  return 0;
}
