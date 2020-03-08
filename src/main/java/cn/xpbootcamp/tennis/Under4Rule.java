package cn.xpbootcamp.tennis;

public class Under4Rule extends ScoreRule {

  public Under4Rule(Player player1, Player player2) {
    super(player1, player2);
  }

  @Override
  public boolean isMatch() {
    return true;
  }

  @Override
  public String getScore() {
    return player1.getScoreForUnder4(player2);
  }
}
