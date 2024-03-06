public class PieceCirculaire extends Piece {
    private double _rayon;

    public PieceCirculaire(TypePiece typePiece, String niveau, double unRayon) {
        super(typePiece, niveau);
        this._rayon = unRayon;

    }

    @Override
    public double surface() {
        double result = 0;
        result = Math.PI * Math.pow(_rayon, 2);
        return result;
    }

}
