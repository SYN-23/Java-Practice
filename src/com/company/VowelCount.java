package com.company;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter a sentence:");
        Scanner wd = new Scanner(System.in);
        String a =wd.nextLine();
        for( int i =0; i<a.length(); i++){
            char ch=a.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }

        }
        System.out.println(count);
    }
}
