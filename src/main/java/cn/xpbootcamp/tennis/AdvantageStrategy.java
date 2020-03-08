package cn.xpbootcamp.tennis;

public class AdvantageStrategy extends ScoreStrategy {

  public AdvantageStrategy(Player player1, Player player2) {
    super(player1, player2);
  }

  @Override
  public boolean isMatch() {
    return player1.onePlayerLeading1PointAndWinMoreThan4(player2);
  }

  @Override
  public String getScore() {
    return "Advantage " + player1.name;
  }
}
