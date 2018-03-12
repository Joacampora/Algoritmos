import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
   for(int k=0; k<=1000;k+=50){
     int instructions= 2*k*k*k - k*k;
     long begin = System.currentTimeMillis();
     int[][] mat= new int[k][k];
     int[][] mat2= new int[k][k];
     int[][] matr= new int[k][k];
     int i,j,l,temp;
     for(i=0;i<k;i++){
       for(j=0;j<k;j++){
         mat[i][j]=(int) (Math.random() * 3) + 1;
         }
      }
      for(i=0;i<k;i++){
        for(j=0;j<k;j++){
             mat2[i][j]=(int) (Math.random() * 3) + 1;
        }
      }
      for (i = 0 ; i < k ; i++ ){
        for (l = 0 ; l < k ; l++ ){
          temp = 0 ;
          for (j = 0 ; j < 2 ; j++ ){
            temp += mat[i][j] * mat2[j][l];
            matr[i][l] = temp ;
            }
        }
      }
  long end = System.currentTimeMillis();
  double time_spent = (double)(end - begin);
  System.out.println(k +": "+ time_spent/instructions);
  }
  }
}