package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Gearbox maclaren=new Gearbox(6);
        Gearbox.Gear first= maclaren.new Gear(1,12.3);
        Gearbox.Gear second= maclaren.new Gear(2,15.4);
        System.out.println(first.driveSpeed(1000));
        System.out.println(second.driveSpeed(1000));
    }
}
