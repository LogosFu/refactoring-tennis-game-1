package cn.xpbootcamp.tennis;

public class EqualStrategy extends ScoreStrategy {

  public EqualStrategy(Player player1, Player player2) {
    super(player1, player2);
  }

  @Override
  public boolean isMatch() {
    return player1.point == player2.point;
  }

  @Override
  public String getScore() {
    String score;
    if (player1.point < 3) {
      score = scores[player1.point] + "-All";
    } else {
      score = "Deuce";
    }
    return score;
  }
}
