package cn.xpbootcamp.tennis;

public abstract class ScoreStrategy {

  protected Player player1;
  protected Player player2;

  protected String[] scores = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

  public abstract boolean isMatch(Player player1, Player player2);

  public abstract String getScore();
}
