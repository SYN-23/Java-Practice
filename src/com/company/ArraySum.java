package com.company;



public class ArraySum {
    public static void main(String[] args) {
        // input array
        int[] [] array1={{1,2,3},{4,5,6},{7,8,9}};
        int[] [] array2={{1,2,3},{4,5,6},{7,8,9}};

        // collecting two array sum in a new array
        int [][] array=sum(array1,array2);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j]+",");
            }
            //creating new line
            System.out.println();
        }
    }
    // function for sum arrays
    public static int[][] sum(int [] []array1,int [] [] array2){
        //creating new array for storing sum of two array
        int [] [] array3=new int[3][3];
        // length of 2nd array
        int len1= array2.length-1;

        for(int i=0;i<3;i++){
            int len2=array2.length-1;

            for(int j=0;j<3;j++){
                array3[i][j]=array1[i][j]+array2[len1][len2];
                len2--;
            }
            len1--;
        }
        return array3;
    }
}
