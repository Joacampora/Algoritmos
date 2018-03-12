 #include<stdio.h>
 #include <stdlib.h>
 #include <time.h>
 void main(void){
   for(int k=0; k<=1000;k+=50){
     int instructions= 2*k*k*k - k*k;
     clock_t begin = clock();
     int mat[k][k],mat2[k][k], matr[k][k];
     int i,j,l,temp;
     for(i=0;i<k;i++){
       for(j=0;j<k;j++){
         mat[i][j]=rand() % 3 + 1;
         }
      }
      for(i=0;i<k;i++){
        for(j=0;j<k;j++){
             mat2[i][j]=rand() % 3 + 1;
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
      
  clock_t end = clock();
  double time_spent = (double)(end - begin) / CLOCKS_PER_SEC;
  printf("%i  %.15f\n ",k , time_spent/instructions);
   }
   }