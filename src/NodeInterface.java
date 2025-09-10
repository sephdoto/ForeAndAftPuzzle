public interface NodeInterface {
  public Node[] getChildren();
  public Node deepCloneWithChildren();
  public Node deepClone();
  public double getV();
  public int getNK();
  public GameState getGameState();
  public void setParent(Node node);
  public Node getParent();
  public void printGrid();
}