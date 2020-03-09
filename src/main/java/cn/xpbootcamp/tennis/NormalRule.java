package cn.xpbootcamp.tennis;

public class NormalRule extends ScoreRule {

  public NormalRule(Player player1, Player player2) {
    super(player1, player2);
  }

  @Override
  public boolean isMatch() {
    return true;
  }

  @Override
  public String getScore() {
    return player1.getNormalScore(player2);
  }
}
