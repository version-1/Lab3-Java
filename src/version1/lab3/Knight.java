package version1.lab3;

public class Knight extends Piece {
  final private int DEFAULT_VALUE = 2;

  public Knight() {
    setValue(DEFAULT_VALUE);
  }

  @Override
  public void move() {
    System.out.println("Like an L");
  }

  @Override
  public String toString() {
    return "Knight{value=’" + this.getValue() + "’" + "}";
  };
}