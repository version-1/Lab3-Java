package version1.lab3;

public class Bishop extends Piece {
  final private int DEFAULT_VALUE = 3;

  public Bishop() {
    setValue(DEFAULT_VALUE);
  }

  @Override
  public void move() {
    System.out.println("Diagonally");
  }

  @Override
  public String toString() {
    return "Bishop{value=’" + this.getValue() + "’" + "}";
  };
}