package cn.xpbootcamp.tennis;

public class Player {

  int point = 0;
  String name;


  public Player(String name, int point) {
    this.point = point;
    this.name = name;
  }

  void playerWinPoint(String playerName) {
    if (playerName.equals(name)) {
      point = point + 1;
    }
  }

  boolean ifFlat(Player player2) {
    return point == player2.point;
  }

  String getFlatScore() {
    if (point < 3) {
      return getScoreName(point) + "-All";
    } else {
      return "Deuce";
    }
  }

  public String getScoreName(int point) {

    String[] scoreNames = {"Love", "Fifteen", "Thirty", "Forty"};
    return scoreNames[point];

  }

  String getScoreForUnder4(Player player2) {
    return getScoreName(point) + "-" + getScoreName(player2.point);
  }

  boolean isAdvantage(Player player2) {
      return point >= 4 && point - player2.point == 1;
  }

  boolean isWin(Player player2) {
      return point >= 4 && point - player2.point >= 2;
  }

  String getWinScore() {
      return "Win for " + name;
  }

  String getAdvantageScore() {
      return "Advantage "+ name;
  }
}