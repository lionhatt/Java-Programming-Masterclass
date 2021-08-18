public class App {
    public static void main(String[] args) throws Exception {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePositon = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePositon);

        highScorePositon = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePositon);

        highScorePositon = calculateHighScorePosition(400);
        displayHighScorePosition("Percey", highScorePositon);

        highScorePositon = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePositon);

        highScorePositon = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePositon);

        highScorePositon = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePositon);

        highScorePositon = calculateHighScorePosition(100);
        displayHighScorePosition("Frank", highScorePositon);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition(String playerName, int highScorePositon) {
        System.out.print(playerName + " managed to get into position " + highScorePositon + " on the high socre table");
    }

    public static int calculateHighScorePosition(int playerScore) {

        // if (playerScore >= 1000) {
        //     return 1;
        // } else if (playerScore >= 500) {
        //     return 2;
        // } else if (playerScore >= 100) {
        //     return 3;
        // }

        // return 4;
        int position = 4; // assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
