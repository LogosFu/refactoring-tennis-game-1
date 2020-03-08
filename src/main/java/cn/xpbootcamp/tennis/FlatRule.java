package cn.xpbootcamp.tennis;

public class FlatRule extends ScoreRule {

  public FlatRule(Player player1, Player player2) {
    super(player1, player2);
  }

  @Override
  public boolean isMatch() {
    return player1.ifFlat(player2);
  }

  @Override
  public String getScore() {
    return player1.getFlatScore();
  }
}
