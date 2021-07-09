package tute07;

import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continueLoop = true;
        while(continueLoop == true) {
            System.out.println("Enter 'A' to add a player.");
            System.out.println("Enter 'V' to view all players.");
            System.out.println("Enter 'B' to view best two batmans.");
            System.out.println("Enter 'C' to view best two bowlers.");
            System.out.println("Enter 'D' to view best two keepers.");
            System.out.println("Enter 'E' to exit the program.");
            System.out.print("Enter the code of the function you want to access: ");
            String accessedFunction = sc.nextLine();

            if (accessedFunction.equalsIgnoreCase("A")) {
                //method
            } else if (accessedFunction.equalsIgnoreCase("V")) {
                //method
            } else if (accessedFunction.equalsIgnoreCase("B")) {
                //method
            } else if (accessedFunction.equalsIgnoreCase("C")) {
                //method
            } else if (accessedFunction.equalsIgnoreCase("D")) {
                //method
            } else if (accessedFunction.equalsIgnoreCase("E")) {
                //method
                continueLoop = false;
            } else {
                System.out.println("Code you entered doesn't belong to any function.");
            }
        }
    }
}
