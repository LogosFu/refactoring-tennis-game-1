
package cn.xpbootcamp.tennis;

import java.util.Arrays;

public class TennisGameImpl implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGameImpl(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name, 0);
        this.player2 = new Player(player2Name, 0);
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1.name)) {
            this.player1.point = this.player1.point + 1;
        } else {
            player2.point = player2.point + 1;
        }
    }

    public String getScore() {
        ScoreRule[] scoreRules = {new FlatRule(player1, player2),
            new AdvantageRule(player1, player2), new AdvantageRule(player2, player1),
            new WinRule(player1, player2), new WinRule(player2, player1),
            new NormalRule(player1, player2)};
        return Arrays.stream(scoreRules).filter(ScoreRule::isMatch).findFirst()
            .map(ScoreRule::getScore).orElse("");
    }

}