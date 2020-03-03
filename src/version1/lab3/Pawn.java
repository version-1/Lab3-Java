package version1.lab3;

public class Pawn extends Piece {
  final private int DEFAULT_VALUE = 1;
  private Boolean promoted = false;
  private Piece newPiece = null;

  public Pawn() {
    setValue(DEFAULT_VALUE);
  }

  public void setPromoted(Boolean promoted) {
    this.promoted = promoted;
  }

  public void setNewPiece(Piece piece) {
    this.newPiece = piece;
  }

  public boolean getPromoted() {
    return this.promoted;
  }

  public void promote(Piece newPiece) {
    this.setPromoted(true);
    this.setNewPiece(newPiece);
  }

  @Override
  public void move() {
    System.out.println("Forward 1");
  }

  @Override
  public String toString() {
    return "Pawn{value=’" + this.getValue() + "’" + "}";
  };

  @Override
  public Boolean equals(Piece piece) {
    if (!super.equals(piece)) {
      return false;
    }
    return (this.getValue() == this.newPiece.getValue()) && (this.promoted == ((Pawn) piece).getPromoted());
  };
}