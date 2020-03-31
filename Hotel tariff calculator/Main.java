#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int month,days,i;
  float rent,amount;
  cin>>month>>rent>>days;
  switch(month)
  {
    case 1:case 2:case 3:case 7:case 8:case 9:case 10:
  {
    amount=days*rent;
    cout<<amount;
    break;
  }
   case 4:case 5:case 6:case 11:case 12:
  {
    amount=(days*rent*0.2)+(days*rent);
    cout<<amount;
    break;
  }
    default:
      cout<<"Invalid Input";
  }
  
        
  
  
  
}