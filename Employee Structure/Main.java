#include<iostream>
#include<string.h>
#include<stdio.h>
using namespace std;
struct employee 
{  
  int id;
  char name[30];
  char designation[30];
  int salary; 
  int age;
};
int main()
{  
 employee  obj;
  cout<<"Enter name:"<<endl;
  scanf("%s",obj.name);
  cout<<"Enter ID:"<<endl;
  cin>>obj.id;
  cout<<"Enter age:"<<endl;
  cin>>obj.age;
  cout<<"Enter designation:"<<endl;
  scanf("%s",obj.designation);
  cout<<"Enter Salary:"<<endl;
  cin>>obj.salary;
  cout<<"Employee Details\n";
  cout<<"Name of the Employee : "<<obj.name<<endl;
  cout<<"ID of the Employee : "<<obj.id<<endl;
  cout<<"Age of the Employee : "<<obj.age<<endl;
  cout<<"Designation of the Employee : "<<obj.designation<<endl;
  cout<<"Salary of the Employee : "<<obj.salary<<endl;
}
