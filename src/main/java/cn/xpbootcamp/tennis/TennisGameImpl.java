
package cn.xpbootcamp.tennis;

public class TennisGameImpl implements TennisGame {

    private int player1Point = 0;
    private int player2Point = 0;
    private String player1Name;
    private String player2Name;

    private String[] scores = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

    public TennisGameImpl(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name)) {
            player1Point++;
        } else {
            player2Point++;
        }
    }

    public String getScore() {
        String score = "";
        if (player1Point == player2Point) {
            if (player1Point < 3) {
                score = scores[player1Point] + "-All";
            } else {
                score = "Deuce";
            }

        } else if (player1Point >= 4 || player2Point >= 4) {
            int minusResult = player1Point - player2Point;
            if (minusResult == 1) {
                score = "Advantage " + player1Name;
            } else if (minusResult == -1) {
                score = "Advantage " + player2Name;
            } else if (minusResult >= 2) {
                score = "Win for " + player1Name;
            } else {
                score = "Win for " + player2Name;
            }
        } else {
            int tempScore = 0;
            tempScore = player1Point;
            score += scores[tempScore];
            score += "-";
            tempScore = player2Point;
            score += scores[tempScore];
        }
        return score;
    }
}