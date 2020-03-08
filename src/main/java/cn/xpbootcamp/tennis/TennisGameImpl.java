
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
            player1Point++;
        } else {
            player2Point++;
        }
    }

    public String getScore() {
        if (player1Point == player2Point) {
            if (player1Point < 3) {
                return getScoreNames(player1Point) + "-All";
            } else {
                return "Deuce";
            }
        } else if (player1Point >= 4 || player2Point >= 4) {
            String score = "";
            if (player1Point - player2Point == 1) {
                score = "Advantage " + player1Name;
            }
            if (player1Point - player2Point == -1) {
                score = "Advantage " + player2Name;
            }
            if (player1Point - player2Point >= 2) {
                score = "Win for " + player1Name;
            }
            if (player2Point - player1Point >= 2) {
                score = "Win for " + player2Name;
            }
            return score;
        } else {
            return getScoreNames(player1Point) + "-" + getScoreNames(player2Point);
        }
    }

    private String getScoreNames(int point) {
        String[] scoresNames = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        return scoresNames[point];
    }

}