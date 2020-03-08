package cn.xpbootcamp.tennis;

public class WinStrategy extends ScoreStrategy {

  public WinStrategy(Player player1, Player player2) {
    super(player1, player2);
  }

  @Override
  public boolean isMatch() {
    return player1.win(player2);
  }

  @Override
  public String getScore() {
    return "Win for " + player1.name;
  }
}
