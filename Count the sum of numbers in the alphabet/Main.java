#include<iostream>
using namespace std;
int main()
{
    string c;
    int sum=0,len=0,b[20],i,j,k,m,n;
    cin>>c;
    for(i=0;c[i]!='\0';i++)
    {
        len++;
    }
    for(i=0;i<len;i++)
    {
        j=c[i];
        if(j>47 && j<58)
        {
            if(c[i+1]>47 && c[i+1]<58)
            {
                m=c[i+1];
                k=(j-48)*10+(m-48);
                if(c[i+2]>47 && c[i+2]<58)
                {
                    n=c[i+2];
                    n=48;
                    sum+=k*10+n;
                    i+=2;
                }
                else
                {
                    sum+=k;
                    i+=1;
                }
            }
            else
            {
                sum+=j-48;
            }
        }
    }
    cout<<sum;
    return 0;
}
