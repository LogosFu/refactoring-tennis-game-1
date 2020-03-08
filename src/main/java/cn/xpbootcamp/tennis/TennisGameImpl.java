
package cn.xpbootcamp.tennis;

public class TennisGameImpl implements TennisGame {

    private Player player1;
    private Player player2;

    private String[] scores = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

    public TennisGameImpl(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name, 0);
        this.player2 = new Player(player2Name, 0);
    }

    public void wonPoint(String playerName) {
        this.player1.winPoint(playerName);
        this.player2.winPoint(playerName);
    }

    public String getScore() {
        if (player1.point == player2.point) {
            return getScoreForPointEqual();
        }
        if (onePlayerLeading1PointAndWinMoreThan4(player1, player2)) {
            return "Advantage " + player1.name;
        }
        if (onePlayerLeading1PointAndWinMoreThan4(player2, player1)) {
            return "Advantage " + player2.name;
        }
        if (player1.point >= 4 && player1.point - player2.point >= 2) {
            return "Win for " + player1.name;
        }
        if (player2.point >= 4 && player2.point - player1.point >= 2) {
            return "Win for " + player2.name;
        }
        return getScoreForBothBlow4();
    }

    private boolean onePlayerLeading1PointAndWinMoreThan4(Player player1, Player player2) {
        return player1.point >= 4 && player1.point - player2.point == 1;
    }

    private String getScoreForBothBlow4() {
        String score = "";
        score += scores[player1.point];
        score += "-";
        score += scores[player2.point];
        return score;
    }

    private String getScoreForPointEqual() {
        String score;
        if (player1.point < 3) {
            score = scores[player1.point] + "-All";
        } else {
            score = "Deuce";
        }
        return score;
    }
}