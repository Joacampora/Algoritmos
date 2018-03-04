/*FIBONACCI GENERICA
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt(), i, fib=0, aux1=1, aux2=1;//se totea con 47
    if(num==1||num==2)
      System.out.print(1);
    else{
      for(i=2; i<num; i++){
        fib=aux1+aux2;
        aux2=aux1;
        aux1=fib;
      }
    }
    System.out.println(fib);*/
import java.util.*;
import java.math.BigInteger;

class Main {
   public static void fibbyte(byte a){
    byte num=a, i, fib=0, aux1=1, aux2=1;
    if(num==1||num==2)
      System.out.print(1);
    else{
      for(i=2; i<num; i++){
        fib= (byte)(aux1+aux2);
        aux2=aux1;
        aux1=fib;
      }
    }
    System.out.println(fib);
  }
  
  public static void fibshort(short a){
    short num=a, i, fib=0, aux1=1, aux2=1;
    if(num==1||num==2)
      System.out.print(1);
    else{
      for(i=2; i<num; i++){
        fib= (short)(aux1+aux2);
        aux2=aux1;
        aux1=fib;
      }
    }
    System.out.println(fib);
  }
  public static void fibint(int a){
    int num=a, i, fib=0, aux1=1, aux2=1;//se totea con 47
    if(num==1||num==2)
      System.out.print(1);
    else{
      for(i=2; i<num; i++){
        fib=aux1+aux2;
        aux2=aux1;
        aux1=fib;
      }
    }
    System.out.println(fib);
  }
  
  public static void fiblong(long a){
    long num=a, i, fib=0, aux1=1, aux2=1;
    if(num==1||num==2)
      System.out.print(1);
    else{
      for(i=2; i<num; i++){
        fib= (aux1+aux2);
        aux2=aux1;
        aux1=fib;
      }
    }
    System.out.println(fib);
  }
  
  public static void fibInteger(Integer a){
    Integer num=a, i, fib=0, aux1=1, aux2=1;
    if(num==1||num==2)
      System.out.print(1);
    else{
      for(i=2; i<num; i++){
        fib= (aux1+aux2);
        aux2=aux1;
        aux1=fib;
      }
    }
    System.out.println(fib);
  }
  
  public static void main(String[] args) {
    fibbyte((byte)(11));    //Overflow con n= 12
    fibshort((short)(23));  //Overflow con n= 24
    fibint(46);             //Overflow con n= 47
    fibInteger(46);         //Overflow con n= 47
    fiblong(92);            //Overflow con n= 93
  }
}