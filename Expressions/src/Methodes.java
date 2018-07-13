
public class Methodes {

    public static void main(String[]args){
        boolean gameOver = true;
        int score = 100,
            levelCompleted = 5,
            bonus = 100;

        calculateScore(gameOver, score, 5, 100);
        calculateScore(gameOver, score, 8, 800);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}
