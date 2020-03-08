
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
        if (player1.isFlat(player2)) {
            return player1.flatRule();
        }
        if (player1.isAdvantage(player2)) {
            return player1.getAdvantageScore();
        }
        if (player2.isAdvantage(player1)) {
            return player2.getAdvantageScore();
        }
        if (player1.isWin(player2)) {
            return getWinScore(player1);
        }
        if (player2.isWin(player1)) {
            return getWinScore(player2);
        }
        return getUnder4Score();
    }

    private String getUnder4Score() {
        return player1.getScoreNames(player1.getPoint()) + "-" + player1
            .getScoreNames(player2.getPoint());
    }

    private String getWinScore(Player player1) {
        return "Win for " + player1.getName();
    }

}