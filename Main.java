package com.kamaljot;

public class Main {

    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("your final score was " + highScore);


        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println(" your score was " + highScore);


        int totalScore = latest(true, 2500, 5460, 6969, 5847);
        System.out.println("the total of all the above elements is " + totalScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelComp, int bonus) {
        if (gameOver == true) {
            int finalScore = score + (levelComp * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return (-1);
    }

    public static int latest(boolean total, int kamaljot, int vaibhav, int anshul, int ankush) {
        if (total == true) {
            int totalScore = ((kamaljot) + (vaibhav) + (anshul) + (ankush));
            return (totalScore);
        }
        return -1;
    }
}
