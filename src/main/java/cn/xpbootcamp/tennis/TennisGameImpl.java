
package cn.xpbootcamp.tennis;

import java.util.Arrays;
import java.util.List;

public class TennisGameImpl implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGameImpl(String player1Name, String player2Name) {
        this.player1 = new Player(0, player1Name);
        this.player2 = new Player(0, player2Name);
    }

    public void wonPoint(String playerName) {
        player1.playerWinPoint(playerName);
        player2.playerWinPoint(playerName);
    }

    public String getScore() {
        List<ScoreRule> scoreRules = Arrays
            .asList(new FlatRule(player1, player2), new AdvantageRule(player1, player2),
                new AdvantageRule(player2, player1), new WinRule(player1, player2),
                new WinRule(player2, player1), new NormalRule(player1, player2));
        return scoreRules.stream().filter(ScoreRule::isMatch).findFirst().map(ScoreRule::getScore)
            .orElse("");
    }

    public static String getScoreName(int point) {

        String[] scoreNames = {"Love", "Fifteen", "Thirty", "Forty"};
        return scoreNames[point];
    }
}