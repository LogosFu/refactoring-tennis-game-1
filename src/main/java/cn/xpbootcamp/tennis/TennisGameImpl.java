
package cn.xpbootcamp.tennis;

public class TennisGameImpl implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGameImpl(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name, 0);
        this.player2 = new Player(player2Name, 0);
    }

    public void wonPoint(String playerName) {
        player1.updatePlayerPoint(playerName);
        player2.updatePlayerPoint(playerName);
    }

    public String getScore() {
        String[] scoreNames = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        if (player1.isFlat(player2)) {
            if (player1.point < 3) {
                return scoreNames[player1.point] + "-All";
            } else {
                return "Deuce";
            }
        } else if (player1.point >= 4 || player2.point >= 4) {
            if (player1.isAdvantage(player2)) {
                return "Advantage " + player1.name;
            }
            if (player2.isAdvantage(player1)) {
                return "Advantage " + player2.name;
            }
            if (player1.isWin(player2)) {
                return "Win for " + player1.name;
            }
            return "Win for " + player2.name;
        } else {
            return scoreNames[player1.point] + "-" + scoreNames[player2.point];
        }
    }

}