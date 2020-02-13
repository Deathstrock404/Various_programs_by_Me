public class challenge {

    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("your final score was " + highScore);



        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println(" your score was " + highScore);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("kamal",highScorePosition);






        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("anshul",highScorePosition);



        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("ankush",highScorePosition);




        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("jatin",highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + "on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }
        else if (playerScore >= 500){
            return 2;
        }
        else if(playerScore >= 100 ){
            return 3;
        }
            return 4;
    }

    public static int calculateScore(boolean gameOver, int score, int levelComp, int bonus) {
        if (gameOver == true) {
            int finalScore = score + (levelComp * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return (-1);
    }
}


