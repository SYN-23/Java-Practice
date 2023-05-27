package com.company;

public class pattern_Rectangle {
    public static void main(String[] args) {
        int n=5;
        int len=5*2-1;
        int min=0;
        for (int i=0;i<len;i++){
            for (int j=0;j<len;j++){
               if(i<j){
                    min=i;
               }else {
                   min=j;
               }
               if (min<len-i){
                   min=min;
               }else{
                   min=len-i-1;
               }
               if(min<len-j-1){
                   min=min;
               }else{
                   min=len-j-1;
               }
                System.out.print(n-min);
            }
            System.out.println();

        }

    }
}
