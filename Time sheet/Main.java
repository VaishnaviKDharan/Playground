#include<iostream>
using namespace std;
int main()
{
        int sun,mon,tue,wed,thu,fri,sat;
        cin>>sun>>mon>>tue>>wed>>thu>>fri>>sat;
        int tot=sun+mon+tue+wed+thu+fri+sat;
        int sal=tot*100;
        if(tot-sun-sat>40)
        sal=sal+((tot-40)*25);
        if(sun>0){
        sal=sal+(sun*50);
        if(sun>=8)
        sal=sal+((sun-8)*15);
        }
        if(mon>=8)
        sal=sal+((mon-8)*15);
        if(tue>=8)
        sal=sal+((tue-8)*15);
        if(wed>=8)
        sal=sal+((wed-8)*15);
        if(thu>=8)
        sal=sal+((thu-8)*15);
        if(fri>=8)
        sal=sal+((fri-8)*15);
        if(sat>0)
        {
        sal=sal+(sat*25);
        if(sat>=8)
        sal=sal+((sat-8)*15);
        }
        cout<<(sal);
}
