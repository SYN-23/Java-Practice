package com.company;

public class remove_repeating_entry {
    public static void main(String[] args) {
        solution(1122113345);
    }

    public static void solution(int number) {
        String name = String.valueOf(number);
        String newName ="";
        newName +=name.charAt(0);
        for (int i = 1; i < name.length(); i++) {

                if (name.charAt(i) != name.charAt(i-1)) {
                    newName += name.charAt(i);
                }
            }


        System.out.println(newName);
    }
}
