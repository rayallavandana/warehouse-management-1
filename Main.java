package rit.sse.ptp;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter maximum number of spaces available to store computers: ");
        int maxSpaces = input.nextInt();
        Shelf shelf = new Shelf(input.nextInt());
        System.out.println("Enter number of computers to store : ");
        int numberOfComputers = input.nextInt();
        for (int storedComputers = 0; storedComputers < numberOfComputers; storedComputers++) {
            Computers computer = new Computers();
            System.out.println("enter the BrandName : ");
            computer.setBrandName(input.next());
            System.out.println("Enter the Model Name : ");
            computer.setModelName(input.next());
            System.out.println("Enter the  Hard Drive Capacity : ");
            computer.setHardDriveCapacity(input.nextInt());
            System.out.println("Enter Memory : ");
            computer.setMemory(input.nextInt());
            System.out.println("Enter Cpu speed : ");
            computer.setCpuSpeed(input.nextFloat());
            System.out.println("Enter Price : ");
            computer.setPrice(input.nextFloat());
            shelf.add(storedComputers, computer);
        }
        shelf.displayComputers();
    }
}
