
package cn.xpbootcamp.tennis;

import java.util.Arrays;
import java.util.List;

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
        List<ScoreStrategy> scoreStrategies = Arrays
            .asList(new EqualStrategy(player1, player2), new AdvantageStrategy(
                    player1, player2), new AdvantageStrategy(player2, player1),
                new WinStrategy(player1, player2), new WinStrategy(player2, player1),
                new LessThan4Strategy(player1, player2));
        return scoreStrategies.stream().filter(ScoreStrategy::isMatch).findAny()
            .map(ScoreStrategy::getScore).get();
    }
}