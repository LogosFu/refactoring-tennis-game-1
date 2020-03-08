
package cn.xpbootcamp.tennis;

public class TennisGameImpl implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGameImpl(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name, 0);
        this.player2 = new Player(player2Name, 0);
    }

    public void wonPoint(String playerName) {
        player2.winPoint(playerName);
        player1.winPoint(playerName);
    }

    public String getScore() {
        if (player1.getPoint() == player2.getPoint()) {
            if (player1.getPoint() < 3) {
                return getScoreNames(player1.getPoint()) + "-All";
            } else {
                return "Deuce";
            }
        } else if (player1.getPoint() >= 4 || player2.getPoint() >= 4) {
            String score = "";
            if (player1.getPoint() - player2.getPoint() == 1) {
                score = "Advantage " + player1.getName();
            }
            if (player1.getPoint() - player2.getPoint() == -1) {
                score = "Advantage " + player2.getName();
            }
            if (player1.getPoint() - player2.getPoint() >= 2) {
                score = "Win for " + player1.getName();
            }
            if (player2.getPoint() - player1.getPoint() >= 2) {
                score = "Win for " + player2.getName();
            }
            return score;
        } else {
            return getScoreNames(player1.getPoint()) + "-" + getScoreNames(player2.getPoint());
        }
    }

    private String getScoreNames(int point) {
        String[] scoresNames = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        return scoresNames[point];
    }

}