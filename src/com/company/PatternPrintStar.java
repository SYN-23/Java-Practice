package com.company;

public class PatternPrintStar {
    public static void main(String[] args) {
    patternPrint(4);
    }

    public static void patternPrint (int number) {
        int count = 1;
        int space = number+2;



        for (int i = 0; i < number; i++) {

            for(int k=space;k>=0;k--){
                System.out.print(" ");
            }

             for (int j = 0; j < count; j++) {

                 System.out.print("* ");


                }
                count += 2;



            System.out.println();

            space=space-2;
            }
        }

}
