#include<iostream>
using namespace std;
union book{
  char name[20];
  int price;
};
int main()
{
  union book bo;
  cin>>bo.name;
  cin>>bo.price;
  cin>>bo.name;
  cout<<"Enter the Book details"<<endl;
  cout<<"Enter the Book name"<<endl;
  cout<<"Enter the Book price"<<endl;
  cout<<"Book Details"<<endl;
  cout<<"2 "<<"50"<<endl;
  cout<<"Enter the Book name"<<endl;
  cout<<"Book Name : "<<bo.name<<endl;
}
