#include<iostream>
#include<stdlib.h>
#include<conio.h>
using namespace std;
class bank
{
    string id,name;
    int wid,dep,bal;
    public:
    void get()
    {
        cout<<"enter id : ";
        cin>>id;
        cout<<"enter name : ";
        cin>>name;
        cout<<"enter balance : ";
        cin>>bal;
    }
    void display()
    {
        cout<<"id : "<<id<<"\n";
        cout<<"name : "<<name<<"\n";
        cout<<"current balance : "<<bal<<"\n";
    }
    void deposit()
    {
        cout<<"enter the deposit amount : ";
        cin>>dep;
        bal += dep;
        cout << "successfully deposited Rs." << dep <<"\n";
    }
    void withdraw()
    {
        cout<<"enter the withdraw amount : ";
        cin>>wid;
        if(wid>bal)
        {
            cout<<"not sufficient balance!";
            return;
        }
        else
        {
            bal -= wid;
            cout<<"successfully withdrawn Rs."<<wid<<"\n";
        }
    }
};
int main()
{
    int n;
    cout<<"enter the no. of students : ";
    cin>>n;
    getch();
    system("cls");
    bank b[n];
    for(int i=0;i<n;i++)
    {
        cout<<"Enter The Data For Student - "<<i+1<<"\n";
        cout<<"----------------------------------------------\n";
        b[i].get();
        int n;
        label:
        cout<<"1) deposit\n2) withdraw\n3) display balance\n4) exit\n";
        cout<<"enter your desired operation : ";
        cin>>n;
        while(n!=4)
        {
            if(n==1)
            {
                b[i].deposit();
                getch();
                system("cls");
                goto label;
            }
            else if(n==2)
            {
                b[i].withdraw();
                getch();
                system("cls");
                goto label;
            }
            else if(n==3)
            {
                b[i].display();
                getch();
                system("cls");
                goto label;
            }
            else{
                break;
            }
        }
        getch();
        system("cls");
    }
}
