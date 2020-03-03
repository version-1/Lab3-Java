package version1.lab3;

public abstract class Piece {
  private int value;
  private Boolean isWhite = false;

  public void setValue(int value) {
    this.value = value;
  }

  public void setIsWhite(Boolean isWhite) {
    this.isWhite = isWhite;
  }

  public int getValue() {
    return this.value;
  }

  public boolean getIsWhite() {
    return this.isWhite;
  }

  public abstract void move();

  public abstract String toString();

  public Boolean equals(Piece piece) {
    return (this.value == piece.value) && (this.isWhite == piece.isWhite);
  };
}