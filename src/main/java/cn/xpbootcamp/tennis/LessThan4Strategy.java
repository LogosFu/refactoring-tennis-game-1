package cn.xpbootcamp.tennis;

public class LessThan4Strategy extends ScoreStrategy {

  public LessThan4Strategy(Player player1, Player player2) {
    super(player1, player2);
  }

  @Override
  public boolean isMatch() {
    return true;
  }

  @Override
  public String getScore() {
    String score = "";
    score += scores[player1.point];
    score += "-";
    score += scores[player2.point];
    return score;
  }
}
