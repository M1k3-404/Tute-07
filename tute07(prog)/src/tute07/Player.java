import java.util.*;

public class Player {

    private String name;
    private int age;
    private String type;
    private int[] statistics;
    private String battingStyle;

    public Player(String name, int age,String type, int[] statistics, String battingStyle) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.statistics = statistics;
        this.battingStyle = battingStyle;
    }

    public double average() {
        double sum = Arrays.stream(statistics).average().getAsDouble();
        return sum;
    }

    public int bestPerformance(){
        int max = 0;
        for (int i = 0; i < statistics.length; i++){
            if (max < statistics[i]){
                max = statistics[i];
            }
        }
        return max;
    }

    public String playerType(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter player type:");
        String playerType = input.next();
        return playerType;
    }

    public String battingStyle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter batting style:");
        String battingStyle = input.next();
        return battingStyle;
    }


}
