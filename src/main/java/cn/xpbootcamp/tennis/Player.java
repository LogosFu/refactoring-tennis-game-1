package cn.xpbootcamp.tennis;

public class Player {

  String name;
  int point;

  public Player(String name, int point) {
    this.name = name;
    this.point = point;
  }

  void updatePlayerPoint(String playerName) {
    if (playerName.equals(name)) {
      point++;
    }
  }

  boolean isAdvantage(Player player2) {
      return point >= 4 && point - player2.point == 1;
  }

  boolean isWin(Player player2) {
      return point >= 4 && point - player2.point >= 2;
  }

  boolean isFlat(Player player2) {
      return point == player2.point;
  }
}
