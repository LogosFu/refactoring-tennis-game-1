
package cn.xpbootcamp.tennis;

import java.util.Arrays;
import java.util.List;

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
        List<ScoreRule> scoreRules = Arrays
            .asList(new FlatRule(player1, player2), new AdvantageRule(player1, player2),
                new AdvantageRule(player2, player1), new WinRule(player1, player2),
                new WinRule(player2, player1), new Under4Rule(player1, player2));
        return scoreRules.stream().filter(ScoreRule::isMatch).findAny().map(ScoreRule::getScore)
            .orElse("");
    }

}