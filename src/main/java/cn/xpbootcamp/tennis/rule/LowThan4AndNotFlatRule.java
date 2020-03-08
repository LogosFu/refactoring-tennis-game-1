package cn.xpbootcamp.tennis.rule;

public class LowThan4AndNotFlatRule extends ScoreRule {

  public LowThan4AndNotFlatRule(Player player1, Player player2) {
    super(player1, player2);
  }

  @Override
  public boolean isMatch() {
    return this.player1.isLowThan4AndNotFlat(player2);
  }

  @Override
  public String getScore() {
    return getScoreName(player1.point) + "-" +getScoreName(player2.point);
  }
}
