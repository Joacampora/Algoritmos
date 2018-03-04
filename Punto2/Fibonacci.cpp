#include<iostream>
using namespace std;
/*  int num, i, fib=0, aux1=1, aux2=1;
  cin>>num;
  if(num==1||num==2)
      cout<<1<<endl;
  else{
    for(i=2; i<num; i++){
      fib=aux1+aux2;
      aux2=aux1;
      aux1=fib;
    }
  }
  cout<<fib;
  return 0;
*/
void fibshort(short a){
  short num=a, i, fib=0, aux1=1, aux2=1;
  if(num==1||num==2)
      cout<<1<<endl;
  else{
    for(i=2; i<num; i++){
      fib=aux1+aux2;
      aux2=aux1;
      aux1=fib;
    }
  }
  cout<<fib<<endl;
}

void fibushort(unsigned short int a){
  unsigned short int num=a, i, fib=0, aux1=1, aux2=1;
  if(num==1||num==2)
      cout<<1<<endl;
  else{
    for(i=2; i<num; i++){
      fib=aux1+aux2;
      aux2=aux1;
      aux1=fib;
    }
  }
  cout<<fib<<endl;
}

void fibint(int a){
  int num=a, i, fib=0, aux1=1, aux2=1;
  if(num==1||num==2)
      cout<<1<<endl;
  else{
    for(i=2; i<num; i++){
      fib=aux1+aux2;
      aux2=aux1;
      aux1=fib;
    }
  }
  cout<<fib<<endl;
}

void fiblong(long a){
  long num=a, i, fib=0, aux1=1, aux2=1;
  if(num==1||num==2)
      cout<<1<<endl;
  else{
    for(i=2; i<num; i++){
      fib=aux1+aux2;
      aux2=aux1;
      aux1=fib;
    }
  }
  cout<<fib<<endl;
}

void fibulong(unsigned long a){
  unsigned long num=a, i, fib=0, aux1=1, aux2=1;
  if(num==1||num==2)
      cout<<1<<endl;
  else{
    for(i=2; i<num; i++){
      fib=aux1+aux2;
      aux2=aux1;
      aux1=fib;
    }
  }
  cout<<fib<<endl;
}


int main(){
  fibshort(23);   //Overflow con n=24
  fibushort(24);  //Overflow con n=25
  fibint(46);     //Overflow con n=47
  fiblong(92);    //Overflow con n=93
  fibulong(93);   //Overflow con n=94
  return 0;
}