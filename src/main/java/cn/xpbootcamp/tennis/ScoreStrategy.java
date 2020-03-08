package cn.xpbootcamp.tennis;

public abstract class ScoreStrategy {

  protected Player player1;
  protected Player player2;

  public ScoreStrategy(Player player1, Player player2) {
    this.player1 = player1;
    this.player2 = player2;
  }

  protected String[] scores = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

  public abstract boolean isMatch();

  public abstract String getScore();
}
