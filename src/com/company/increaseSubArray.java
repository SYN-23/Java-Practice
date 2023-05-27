package com.company;

public class increaseSubArray {
    public static void main(String[] args) {
     int [] array={1,2,5,3,4};
        System.out.println(increasingArray(array));
     int [] array2={1,2};
        System.out.println(increasingArray(array2));
    }

    public static int increasingArray(int [] array){
        if(array.length==1){
            return 1;
        }
        if (array.length == 2) {
            if(array[1]-array[0]-1==0){
                return 2;
            }else{
                return 1;
            }
        }
        int[] newArray=new int[array.length];
        int i=0;
        int count=0;
        while(array[i]<array.length-1){
            int j=i+1;
            if(array[j]-array[i]==1){
                newArray[count]=array[j];
                count++;
                i++;
            }else if (array[j+1]-array[i]==1){
                newArray[count]=array[j];
                count++;
                i+=2;
            }else{
                i++;
            }
        }
        return count+1;

    }
}
