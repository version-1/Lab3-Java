package version1.lab3;

public class Rook extends Piece {
  final private int DEFAULT_VALUE = 5;

  public Rook() {
    setValue(DEFAULT_VALUE);
  }

  @Override
  public void move() {
    System.out.println("Horizontally or vertically");
  }

  @Override
  public String toString() {
    return "Rook{value=’" + this.getValue() + "’" + "}";
  };
}