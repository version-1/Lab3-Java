package version1.lab3;

import java.util.ArrayList;
import java.util.List;

public class Driver {
  public static void main(String[] args) {
    List<Piece> pieces = getAllTypes();
    for (Piece piece : pieces) {
      piece.move();
    }

    Pawn p1 = new Pawn();
    p1.setIsWhite(true);
    p1.promote(new Queen());
    Pawn p2 = new Pawn();
    p2.setIsWhite(true);
    Pawn p3 = new Pawn();
    Pawn p4 = new Pawn();
    p4.promote(new Queen());
    Pawn p5 = new Pawn();
    p5.setIsWhite(true);
    p5.promote(new Knight());

    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p4));
    System.out.println(p1.equals(p5));
    System.out.println(p2.equals(p3));
    System.out.println(p4.equals(p5));
  }

  private static List<Piece> getAllTypes() {
    List<Piece> pieces = new ArrayList<Piece>();
    Piece pawn = new Pawn();
    Piece knight = new Knight();
    Piece bishop = new Bishop();
    Piece rook = new Rook();
    Piece queen = new Queen();
    Piece king = new King();
    pieces.add(pawn);
    pieces.add(knight);
    pieces.add(bishop);
    pieces.add(rook);
    pieces.add(queen);
    pieces.add(king);
    return pieces;
  }

}