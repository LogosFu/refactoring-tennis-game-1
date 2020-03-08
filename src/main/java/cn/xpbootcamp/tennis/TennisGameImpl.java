
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
        if (player1Point == player2Point) {
            return getScoreForPointEqual();
        } else if (player1Point >= 4 || player2Point >= 4) {
            int minusResult = player1Point - player2Point;
            if (minusResult == 1) {
                return "Advantage " + player1Name;
            }
            if (minusResult == -1) {
                return "Advantage " + player2Name;
            }
            if (minusResult >= 2) {
                return "Win for " + player1Name;
            }
            return "Win for " + player2Name;
        } else {
            return getScoreForBothBlow4();
        }
    }

    private String getScoreForBothBlow4() {
        String score = "";
        score += scores[player1Point];
        score += "-";
        score += scores[player2Point];
        return score;
    }

    private String getScoreForPointEqual() {
        String score;
        if (player1Point < 3) {
            score = scores[player1Point] + "-All";
        } else {
            score = "Deuce";
        }
        return score;
    }
}