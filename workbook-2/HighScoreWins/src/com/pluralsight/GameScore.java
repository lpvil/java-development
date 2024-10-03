package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class GameScore {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //prompt user to enter team and score of event
        //input single string that contains team names/final score of match
        System.out.println("enter team names and scores (team1:team2|score1:score2): ");
        String score = scanner.nextLine();
        String[] gamescore = score.split(Pattern.quote("|"));
        String[] teams = gamescore[0].split(":");
        String[] scores = gamescore[1].split(":");
        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);
        String team1 = teams[0];
        String team2 = teams[1];
        //Display output
        if (homeScore > visitorScore){
            System.out.println("Winner is: " + team1);}
        else{
                System.out.println("Winner is: " + team2);
            }
        }
    }