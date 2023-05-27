package com.company;

import java.util.Arrays;

public class weirdArray {
    public static void main(String[] args) {
          int [] array={3,3,1,3,3};
          int[] array2={1,2,3};

        System.out.println(subArrayTester(array));
        System.out.println(subArrayTester(array2));
    }

    public static int subArrayTester(int [] array){
        if(array.length<2){
            return 0;
        }
        //Arrays.sort(array);

        int [] newArray=new int[array.length];
        int count =0;
        int max;

        for(int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                }else{
                    newArray[i]=count;
                    count=0;
                    //break;
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
        max = Arrays.stream(newArray).max().getAsInt();
        return max;
    }
}
