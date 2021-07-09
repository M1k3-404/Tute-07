package tute07;

import java.util.*;

public class Player {

    public String name;
    private int age;
    private String type;
    public int score;
    public int wickets;
    private String battingStyle;

    public Player(String name, int age,String type, int score, int wickets, String battingStyle) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.score = score;
        this.wickets = wickets;
        this.battingStyle = battingStyle;
    }

    void viewDetails() {
        System.out.println("Player Name: " + name);
        System.out.println("Player age: " + age);
        System.out.println("Player type: " + type);
        System.out.println("Runs scored in last 15 matches: " + score);
        System.out.println("Wickets taken in last 15 matches: " + wickets);
        System.out.println("Batting style: " + battingStyle);
    }


}
