package com.company;


import java.util.Scanner;

public class exception_handel {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
//        int number =sc.nextInt();
//        System.out.println(number);

         try{
             int number =sc.nextInt();
             System.out.println(number);
         }catch (Exception e){
             System.out.println("this is not an integer ");
         }


        System.out.println(2+4);





    }
}
