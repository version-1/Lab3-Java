package version1.lab3;

public class Queen extends Piece {
  final private int DEFAULT_VALUE = 9;

  public Queen() {
    setValue(DEFAULT_VALUE);
  }

  @Override
  public void move() {
    System.out.println("Like bishop and rook");
  }

  @Override
  public String toString() {
    return "Queen{value=’" + this.getValue() + "’" + "}";
  };
}