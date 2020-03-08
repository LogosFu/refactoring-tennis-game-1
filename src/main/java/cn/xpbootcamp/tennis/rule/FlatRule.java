package cn.xpbootcamp.tennis.rule;

public class FlatRule extends ScoreRule {

  public FlatRule(Player player1, Player player2) {
    super(player1, player2);
  }

  @Override
  public boolean isMatch() {
    return this.player1.isFlat(player2);
  }

  @Override
  public String getScore() {
    if (player1.point < 3) {
      return getScoreName(player1.point) + "-All";
    } else {
      return "Deuce";
    }
  }
}
