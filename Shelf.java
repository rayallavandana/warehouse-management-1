package rit.sse.ptp;

import java.util.Arrays;

public class Shelf {
     private Computers[] computerArray;

    public Shelf(int maxSpaces) {
        computerArray = new Computers[maxSpaces];
    }

    public void add(int position, Computers computer) {
        this.computerArray[position] = computer;
    }
    public Computers getComputerAtPosition(int position) {
        return this.computerArray[position];
    }
    public void displayComputers() {
        for (int currentComputer = 0; currentComputer < computerArray.length; currentComputer++) {
            if (computerArray[currentComputer] != null) {
                System.out.println("position :" + " " + currentComputer+ " " + getComputerAtPosition(currentComputer));
                System.out.println();
            } else {
                System.out.printf("Position %d: empty", currentComputer);
                System.out.println();
            }
        }
    }


}

