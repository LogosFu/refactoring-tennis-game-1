package cn.xpbootcamp.tennis;

public class Under4Rule extends ScoreRule {

  public Under4Rule(Player player1, Player player2) {
    super(player1, player2);
  }

  @Override
  public boolean isMatch() {
    return player1.getPoint() <= 4 && player2.getPoint() <= 4 && player2.getPoint() != player1
        .getPoint();
  }

  @Override
  public String getScore() {
    return player1.getUnder4Score(player2);
  }
}
