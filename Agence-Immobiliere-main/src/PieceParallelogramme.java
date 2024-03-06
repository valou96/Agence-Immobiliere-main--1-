public class PieceParallelogramme extends Piece {

    private double _base;
    private double _hauteur;

    public PieceParallelogramme(TypePiece typePiece, String niveau, double uneBase, double uneHauteur) {
        super(typePiece, niveau);
        this._base = uneBase;
        this._hauteur = uneHauteur;

    }

    @Override
    public double surface() {
        double result = 0;
        result = _base * _hauteur;
        return result;
    }

    public double get_base() {
        return _base;
    }

    public double get_hauteur() {
        return _hauteur;
    }

}
