package com.company;


import java.util.Arrays;

public class Array_sum {
    public static void main(String[] args) {
        int[] array ={9,9,9,9};

        int k= 34;
        System.out.println(Arrays.toString(sum(array,k)));

    }

    public static Character[] sum(int [] array ,int k){
       int number =0;
       for (int i =0;i<array.length;i++){
          number=(number*10)+array[i];

       }

       int n_number=number+k;

       String value = Integer.toString(n_number);

       Character [] array2=new Character[value.length()];

       for (int i=0;i<value.length();i++){

           array2[i]=value.charAt(i);
       }

        return array2;
    }
}
