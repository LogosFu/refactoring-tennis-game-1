package cn.xpbootcamp.tennis;

public class Player {

  String name;
  int point = 0;

  public Player(String name, int point) {
    this.name = name;
    this.point = point;
  }

  String getScoreName(int point) {

    String[] scoreNames = {"Love", "Fifteen", "Thirty", "Forty"};
    return scoreNames[point];
  }

  boolean isWin(Player player2) {
    return point >= 4 && point - player2.point >= 2;
  }

  boolean isAdvantage(Player player2) {
    return point >= 4 && point - player2.point == 1;
  }

  boolean isFlat(Player player2) {
    return point == player2.point;
  }

  String getAdvantageScore() {
    return "Advantage " + name;
  }

  String getFlatScore() {
    if (point < 3) {
      return getScoreName(point) + "-All";
    } else {
      return "Deuce";
    }
  }

  String getWinScore() {
    return "Win for " + name;
  }

  String getNormalScore(Player player2) {
    return getScoreName(point) + "-" + getScoreName(player2.point);
  }
}