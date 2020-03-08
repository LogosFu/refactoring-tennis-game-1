package cn.xpbootcamp.tennis;

public class AdvantageRule extends ScoreRule {

  public AdvantageRule(Player player1, Player player2) {
    super(player1, player2);
  }

  @Override
  public boolean isMatch() {
    return this.player1.isAdvantage(player2);
  }

  @Override
  public String getScore() {
    return "Advantage " + player1.name;
  }
}
