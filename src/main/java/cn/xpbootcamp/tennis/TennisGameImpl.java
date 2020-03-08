
package cn.xpbootcamp.tennis;

public class TennisGameImpl implements TennisGame {

    private int player1Point = 0;
    private int player2Point = 0;
    private String player1Name;
    private String player2Name;

    public TennisGameImpl(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name)) {
            player1Point += 1;
        }
        if (playerName.equals(player2Name)) {
            player2Point += 1;
        }
    }

    public String getScore() {
        String love = "Love";
        String fifteen = "Fifteen";
        String thirty = "Thirty";
        String forty = "Forty";
        String[] scoreNames = new String[]{love, fifteen, thirty, forty};
        if (player1Point == player2Point) {
            String score = "";
            if (player1Point < 3) {
                score = scoreNames[player1Point] + "-All";
            } else {
                score = "Deuce";
            }
            return score;
        } else if (player1Point >= 4 || player2Point >= 4) {
            String score = "";
            int minusResult = player1Point - player2Point;
            if (minusResult == 1) {
                score = "Advantage " + player1Name;
            } else {
                if (minusResult == -1) {
                    score = "Advantage " + player2Name;
                } else if (minusResult >= 2) {
                    score = "Win for " + player1Name;
                } else {
                    score = "Win for " + player2Name;
                }
            }
            return score;
        } else {
            String score = "";
            int tempScore = 0;
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = player1Point;
                } else {
                    score += "-";
                    tempScore = player2Point;
                }
                score += scoreNames[tempScore];
            }
            return score;
        }
    }
}