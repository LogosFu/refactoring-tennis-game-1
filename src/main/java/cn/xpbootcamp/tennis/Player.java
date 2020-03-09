package cn.xpbootcamp.tennis;

import static cn.xpbootcamp.tennis.TennisGameImpl.getScoreName;

public class Player {

  int point = 0;
  String name;

  public Player(int point, String name) {
    this.point = point;
    this.name = name;
  }

  void playerWinPoint(String playerName) {
      if (playerName.equals(name)) {
          point = point + 1;
      }
  }

  boolean isFlat(Player player2) {
      return point == player2.point;
  }

  String getFlatScore() {
      if (point < 3) {
          return getScoreName(point) + "-All";
      }

      return "Deuce";
  }

  String getNormalScore(Player player2) {
      return getScoreName(point) + "-" + getScoreName(player2.point);
  }

  boolean isWin(Player player2) {
      return point >= 4 && point - player2.point >= 2;
  }

  boolean isAdvantage(Player player2) {
      return point >= 4 && point - player2.point == 1;
  }

  String getAdvantageScore() {
      return "Advantage " + name;
  }

  String getWinScore() {
      return "Win for " + name;
  }
}