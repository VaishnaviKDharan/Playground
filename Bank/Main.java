#include<iostream>
using namespace std;
class Bank
{
  public:
  int acc_no,bal,dep,wd,t;
  char nam[10],typ[10];
  void read();
  int total();
  void print();
};
void Bank::read()
{
 cout<<"Enter Details:"<<endl<<"Account No.";
  cin>>acc_no;
  cout<<endl<<"Name :";
  cin>>nam;
  cout<<endl<<"Account Type :";
  cin>>typ;
  cout<<endl<<"Balance :";
  cin>>bal;
  cout<<endl<<"Enter Deposit Amount =";
  cin>>dep;
  cout<<endl<<"Enter Withdraw Amount =";
  cin>>wd;
}
void Bank::print()
{
  if(total()<0)
    cout<<endl<<"Cannot Withdraw Amount";
  cout<<endl<<"Accout No. : "<<acc_no;
  cout<<endl<<"Name : "<<nam;
  cout<<endl<<"Account Type : "<<typ;
  cout<<endl<<"Balance : "<<total();
}
int Bank::total()
{
 t=0;
  t=(bal+dep)-wd;
  return t;
}
int main()
{
  Bank b;
  b.read();
  b.print();
}
