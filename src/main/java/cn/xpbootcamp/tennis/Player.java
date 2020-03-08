package cn.xpbootcamp.tennis;

public class Player {

  String name;

  int point;

  public Player(String name, int point) {
    this.name = name;
    this.point = point;
  }

  void winPoint(String name) {
    if (this.name.equals(name)) {
      this.point++;
    }
  }

  boolean win(Player player2) {
      return point >= 4 && point - player2.point >= 2;
  }

  boolean onePlayerLeading1PointAndWinMoreThan4(Player player2) {
      return point >= 4 && point - player2.point == 1;
  }
}
