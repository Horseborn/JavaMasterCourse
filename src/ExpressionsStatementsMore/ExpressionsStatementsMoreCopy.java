

void main() {
    figureOutScore(true, 100, 1, 100);
    displayHighScorePosition("Sebastian", 2);

    System.out.println(calculateHighScorePosition(900));

}

public void figureOutScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    int finalScore = score;
    if (gameOver) {
        finalScore += (levelCompleted * bonus);
        finalScore += 1000;
        System.out.println("Your final score was " + finalScore);
    }
}

public static void displayHighScorePosition(String name, int pos) {
    System.out.println(name + " managed to get into position: " + pos);
}

public static int calculateHighScorePosition(int score) {
    int accumulatedPoint;
    int internalScore = 0;
    if (score >= 1000) {
        accumulatedPoint = 1;
    } else if (score >= 500) {
        accumulatedPoint = 2;
    } else if (score <= 100) {
        accumulatedPoint = 3;
    } else {
        accumulatedPoint = 4;
    }
    switch (accumulatedPoint) {
        case 1:
            internalScore = 1;
            break;
        case 2:
            internalScore = 2;
            break;
        case 3:
            internalScore = 2;
            break;
        case 4:
            internalScore = 4;
            break;

        default:
            System.out.println();
    }
    return internalScore;
} // ineffective way of doing this but i like switch statements


void score() {
    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    int finalScore = score;

    if (gameOver) {
        finalScore += (levelCompleted * bonus);
        System.out.println("Your final score was " + finalScore);
    }
    System.out.println("");
    score = 10_000;
    levelCompleted = 8;
    bonus = 200;
    finalScore = score;
    if (gameOver) {
        finalScore += (levelCompleted * bonus);
        System.out.println("Your final score was " + finalScore);
    }
}