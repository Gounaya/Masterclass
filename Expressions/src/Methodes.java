
public class Methodes {

    public static void main(String[]args){
        boolean gameOver = true;
        int score = 100,
            levelCompleted = 5,
            bonus = 100;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static void calculateScore(){

    }
}
