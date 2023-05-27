package com.company;

import java.util.Scanner;

public class Number_pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Type your number");
        //int x =sc.nextInt();
        int x=5;
        int y=2*x-1;
        int z=x;
        int k=z-1;

        for (int i=0;i<y;i++){
            System.out.print(x+" ");


        }
        System.out.println("");

        for(int i=0;i<k;i++){
            x--;
            System.out.print(z+" ");
            for (int j=0;j<y-2;j++){

                System.out.print(x+" ");
            }
            System.out.print(z+" ");
            System.out.println("");
        }
    }
}
