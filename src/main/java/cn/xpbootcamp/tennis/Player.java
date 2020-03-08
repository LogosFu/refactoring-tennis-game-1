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
}
