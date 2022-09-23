package rit.sse.ptp;

import java.util.Arrays;

public class Shelf {
    private Computer[] Computers;


    public Shelf(int maxSpaces) {
        Computers = new Computer[maxSpaces];
    }

    public void add(int position, Computer Computers) {
        this.Computers[position] = Computers;
    }

    public Computer getComputerAtPosition(int position) {
        return this.Computers[position];
    }

    public void displayComputers() {
        for (int currentComputer = 0; currentComputer < Computers.length; currentComputer++) {
            if (Computers[currentComputer] != null) {
                System.out.println("position :" + " " + currentComputer + " " + getComputerAtPosition(currentComputer));
                System.out.println();
            } else {
                System.out.printf("Position %d: empty", currentComputer);
                System.out.println();
            }
        }
    }


}

