package reinoutvanbets;

public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("Reinout", 28);

        int highScorePosition=calculateHighScorePosition(900);
        System.out.println(highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " in the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        } else return 4;

    }

}
