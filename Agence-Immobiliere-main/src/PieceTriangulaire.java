public class PieceTriangulaire extends Piece {
    private double _base;
    private double _hauteur;

    public PieceTriangulaire(TypePiece typePiece, String niveau, double uneBase, double unehauteur) {
        super(typePiece, niveau);
        this._base = uneBase;
        this._hauteur = unehauteur;
    }

    @Override
    public double surface() {
        double result = 0;

        result = _base * _hauteur * 1 / 2;

        return result;
    }

    public double get_base() {
        return _base;
    }

    public double get_hauteur() {
        return _hauteur;
    }

}
