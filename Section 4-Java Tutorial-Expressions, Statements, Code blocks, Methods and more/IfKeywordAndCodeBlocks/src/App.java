public class App {
    public static void main(String[] args) throws Exception {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // if (score < 5000 && score > 1000) {
        // System.out.println("Your score was less than 5000 but greater than 1000");
        // } else if (score < 1000) {
        // System.out.print("You score was less than 1000");

        // } else {
        // System.out.println("Got here");
        // }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printOut above still display as well

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
