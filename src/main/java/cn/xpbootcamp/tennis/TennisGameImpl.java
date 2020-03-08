
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
            String score = "";
            switch (player1Point) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
            return score;
        } else if (player1Point >= 4 || player2Point >= 4) {
            String score = "";
            int minusResult = player1Point - player2Point;
            if (minusResult == 1) {
                score = "Advantage player1";
            } else if (minusResult == -1) {
                score = "Advantage player2";
            } else if (minusResult >= 2) {
                score = "Win for player1";
            } else {
                score = "Win for player2";
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
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
            return score;
        }
    }
}