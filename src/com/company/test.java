package com.company;

public class test {
    public static void main(String[] args) {
        System.out.println(MagicTwin(17));

    }

    public static int MagicTwin (int number){
        String name=String.valueOf(number);
        int sum=0;
        if(name.length()==1){
            return number;
        }else{
           while (number>0){
              int lastDigit=number%10;
              sum+=lastDigit;
              number=number/10;
           }
        }

        String name2=String.valueOf(sum);
        int sum2;
        if(name2.length()>1){
          sum2=  MagicTwin(sum);
        }else{
           sum2= sum;
        }
     return sum2;

    }
}
