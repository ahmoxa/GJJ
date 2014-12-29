package com.company.tasks4;


import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int team1 = 0;
        int team2 = 0;

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Input team (1,2)...");
            int curTeam = scanner.nextInt();
            if(curTeam == 0) break;
            int curPoints = (int)((Math.random() * 3) + 1);
            System.out.println("curPoints = " + curPoints);
            if(curTeam == 1){
                team1 += curPoints;
            }else if(curTeam == 2){
                team2 += curPoints;
            }
            System.out.println("Team1 " + team1 + ":" + team2 + " Team2");
        }

        if(team1 > team2){
            System.out.println("Winner is team1");
        }else if(team1 == team2){
            System.out.println("Draw");
        }else{
            System.out.println("Winner is team2");
        }
    }
}
