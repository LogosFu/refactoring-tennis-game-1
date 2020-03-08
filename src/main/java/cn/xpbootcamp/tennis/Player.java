package cn.xpbootcamp.tennis;

public class Player {

  private String name;
  private int point;

  public Player(String name, int point) {
    this.name = name;
    this.point = point;
  }

  public void winPoint(String playerName) {
    if (playerName.equals(name)) {
      point++;
    }
  }

  public String getName() {
    return name;
  }

  public int getPoint() {
    return point;
  }

  public boolean isFlat(Player player2) {
    return point == player2.getPoint();
  }

  boolean isAdvantage(Player player2) {
      return getPoint() >= 4 && getPoint() - player2.getPoint() == 1;
  }

  boolean isWin(Player player2) {
      return getPoint() >= 4 && getPoint() - player2.getPoint() >= 2;
  }

  String getAdvantageScore() {
    return "Advantage " + getName();
  }

  String getFlatScore() {
    if (getPoint() < 3) {
      return ScoreRule.getScoreNames(getPoint()) + "-All";
    } else {
      return "Deuce";
    }
  }

  String getUnder4Score(Player player2) {
    return ScoreRule.getScoreNames(getPoint()) + "-" + ScoreRule
        .getScoreNames(player2.getPoint());
  }

  String getWinScore() {
    return "Win for " + getName();
  }
}
