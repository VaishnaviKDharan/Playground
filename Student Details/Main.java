#include<iostream>
using namespace std;
class Student
{
public:
  char name[50];
  int roll,total;
  float percent;
  float calc();
  void read();
  void detail();
};
float Student::calc()
{
  percent=0;
  percent=((float)total/5);
  return percent;
}
void Student::detail()
{
  cout<<"Student details:"<<endl<<"Name: "<<name<<endl<<"Roll Number: "<<roll<<endl;
   cout<<"Total: "<<total<<endl<<"Percentage: "<<calc();
}
 void Student::read()
 {
  cout<<"Enter name:"<<endl;cin>>name;
  cout<<"Enter roll number:"<<endl;cin>>roll;
  cout<<"Enter total marks outof 500:"<<endl;cin>>total;
 }
int main()
{
  Student S1; 
  S1.read();
  S1.detail();
  return 0;
}
