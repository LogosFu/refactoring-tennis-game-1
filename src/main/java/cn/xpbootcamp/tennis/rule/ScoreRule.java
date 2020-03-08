package cn.xpbootcamp.tennis.rule;

public abstract class ScoreRule {

  protected Player player1;
  protected Player player2;
  private String[] scoreNames = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

  public ScoreRule(Player player1, Player player2) {
    this.player1 = player1;
    this.player2 = player2;
  }

  public abstract boolean isMatch();

  public abstract String getScore();

  protected String getScoreName(int point) {
    return scoreNames[point];
  }
}
