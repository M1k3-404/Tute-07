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
                addPlayer();
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

    private static void addPlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Player name: ");
        String name = sc.nextLine();
        System.out.print("Enter player age: ");
        int age = sc.nextInt();
        System.out.print("Enter Player type: ");
        String type = sc.nextLine();
        System.out.print("Enter Player batting-style: ");
        String battingStyle = sc.nextLine();

        System.out.print("Enter runs scored by the player in last 15 matches: ");
        int playerRuns = sc.nextInt();
        System.out.print("Enter the number of wickets taken by the player in last 15 matches: ");
        int playerWickets = sc.nextInt();

        int[] statistics = new int[2];
        statistics[0] = playerRuns;
        statistics[1] = playerWickets;

        Player newPlayer = new Player(name, age, type, statistics, battingStyle);

        System.out.println("Player Name: " + name);
        System.out.println("Player age: " + age);
        System.out.println("Player type: " + type);
        System.out.println("Runs scored in last 15 matches: " + statistics[0]);
        System.out.println("Wickets taken in last 15 matches: " + statistics[1]);
        System.out.println("Batting style: " + battingStyle);
    }
}
