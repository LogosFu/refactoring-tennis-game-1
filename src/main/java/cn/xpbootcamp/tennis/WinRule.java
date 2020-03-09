package cn.xpbootcamp.tennis;

public class WinRule extends ScoreRule {

  public WinRule(Player player1, Player player2) {
    super(player1, player2);
  }

  @Override
  public boolean isMatch() {
    return player1.isWin(player2);
  }

  @Override
  public String getScore() {
    return player1.getWinScore();
  }
}
