#include<iostream>
#include<cstring>
using namespace std;
int main()
{
    char a[10][20];
    int i=0,k,j;
    while(1)
    {
        cin>>a[i];
        if(!strcmp(a[i],"####"))
        break;
        i++;
    }
    cout<<a[0]<<"\n";
    for(j=1;j<i;j++)
    {
        k=0;
        while(a[j-1][k++]!='\0');
            if(a[j-1][k-2]==a[j][0])
            {
                cout<<a[j]<<"\n";
            }
    }
    return 0;
}

