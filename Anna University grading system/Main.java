#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int mark;
  cin>>mark;
  if(mark==100)
    cout<<"S";
  else if(mark>=90 && mark<=99)
    cout<<"A";
  else if(mark>=80 && mark<=89)
    cout<<"B";
  else if(mark>=70 && mark<=79)
    cout<<"C";
  else if(mark>=60 && mark<=69)
    cout<<"D";
  else if(mark>=50 && mark<=59)
    cout<<"E";
  else if(mark<50)
    cout<<"F";
  else if(mark>100)
    cout<<"Invalid Input";
}