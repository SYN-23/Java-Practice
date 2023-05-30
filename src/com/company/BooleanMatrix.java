package com.company;

public class BooleanMatrix {
    public static void main(String[] args) {
        int[] [] array1={{1,0,0,0},{0,0,0,0},{0,1,0,0},{0,0,0,0},{0,0,0,1}};
        int row=5;
        int columns=4;
        matrixConvert(array1,row,columns);
    }


    public static void matrixConvert(int [][] matrix,int row ,int columns){
       int [][] array=new int[row][columns];
       int count =0;

       // loop for set row
       for(int i=0;i<row;i++){

          //loop for check if any 1 in columns
           for(int j=0;j<columns;j++){
               if(matrix[i][j]==1){
                   count=1;
               break;
               }
           }
           //loop for set columns
           for(int j=0;j<columns;j++){
               if(count==1){

                   array[i][j]=count;
               }else{
                   array[i][j]=matrix[i][j];
               }

           }
           count=0;
       }

       //loop for print the final matrix
        for(int i=0;i<row;i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + ",");
            }
            System.out.println();
        }

    }

}
