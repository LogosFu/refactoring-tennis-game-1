package cn.xpbootcamp.tennis;

public class LessThan4Strategy extends ScoreStrategy {

  @Override
  public boolean isMatch(Player player1, Player player2) {
    this.player1 = player1;
    this.player2 = player2;
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
