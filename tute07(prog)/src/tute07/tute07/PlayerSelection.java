package tute07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<Player>();

        Scanner sc = new Scanner(System.in);

        boolean continueLoop = true;
        while(continueLoop == true) {
            System.out.println("Enter 'A' to add a player.");
            System.out.println("Enter 'V' to view all players.");
            System.out.println("Enter 'B' to view best batman.");
            System.out.println("Enter 'C' to view best bowler.");
            System.out.println("Enter 'E' to exit the program.");
            System.out.print("Enter the code of the function you want to access: ");
            String accessedFunction = sc.nextLine();

            if (accessedFunction.equalsIgnoreCase("A")) {
                System.out.print("Enter Player name: ");
                String name = sc.nextLine();
                System.out.print("Enter player age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Player type: ");
                String type = sc.nextLine();
                System.out.print("Enter Player batting-style: ");
                String battingStyle = sc.nextLine();
                System.out.print("Enter runs scored by the player in last 15 matches: ");
                int score = sc.nextInt();
                System.out.print("Enter the number of wickets taken by the player in last 15 matches: ");
                int wickets = sc.nextInt();
                System.out.println("");

                Player newPlayer = new Player(name, age, type, score, wickets, battingStyle);

                newPlayer.viewDetails();
                players.add(newPlayer);

            } else if (accessedFunction.equalsIgnoreCase("V")) {
                for(int i = 0; i < players.size(); i++) {
                    players.get(i).viewDetails();
                }

            } else if (accessedFunction.equalsIgnoreCase("B")) {
                int maxRuns = 0;
                for(int i = 0; i < players.size(); i++) {
                    for(int j = 0; j < players.size(); j++) {
                        if(players.get(maxRuns).score < players.get(j).score) {
                            maxRuns = j;
                        }
                    }
                }

                System.out.println("Best batman: " + players.get(maxRuns).name);

            } else if (accessedFunction.equalsIgnoreCase("C")) {
                int maxWickets = 0;
                for(int i = 0; i < players.size(); i++) {
                    for(int j = 0; j < players.size(); j++) {
                        if(players.get(maxWickets).wickets < players.get(j).wickets) {
                            maxWickets = j;
                        }
                    }
                }

                System.out.println("Best bowler: " + players.get(maxWickets).name);

            } else if (accessedFunction.equalsIgnoreCase("E")) {
                System.out.println("Thank you for using our system.");
                System.out.println("Have a nice day!");
                continueLoop = false;

            } else {
                System.out.println("Code you entered doesn't belong to any function.");
            }
        }
    }
}
