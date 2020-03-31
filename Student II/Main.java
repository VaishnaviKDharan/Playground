#include<iostream>
using namespace std;
class Student
{
 public:
  char name[5];
  int roll,percent;
  void read();
  void detail();
};
void Student::detail()
{
   cout<<name<<endl<<roll<<endl;
   cout<<percent<<"%";
}
 void Student::read()
 {
  cin>>name;
  cin>>roll;
  cin>>percent;
 }
int main()
{
  Student S1; 
  S1.read();
  S1.detail();
  return 0;
}
