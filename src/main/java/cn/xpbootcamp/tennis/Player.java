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
}
