#include<iostream>
#include<string.h>
#include<stdio.h>
using namespace std;
union employee
{
  char name[15];
  int salary;
};
int main()
{
  employee obj;
  cout<<"Enter the Employee details \nEnter the Employee name :\n";
  scanf("%s",obj.name);
  cout<<"Enter the Employee salary :\n";
  cin>>obj.salary;
  cout<<"Employee Details\n";
  cout<<obj.name<<" "<<obj.salary;
}
