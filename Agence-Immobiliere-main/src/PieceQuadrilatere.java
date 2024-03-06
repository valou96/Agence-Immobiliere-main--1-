public class PieceQuadrilatere extends Piece {
    private double _longueur;
    private double _largeur;

    public PieceQuadrilatere(TypePiece typePiece, String niveau, double uneLongueur, double uneLargeur) {
        super(typePiece, niveau);
        this._longueur = uneLongueur;
        this._largeur = uneLargeur;

    }

    @Override
    public double surface() {
        double result = 0;
        result = _longueur * _largeur;
        return result;
    }

    public double get_longueur() {
        return _longueur;
    }

    public double get_largeur() {
        return _largeur;
    }

}
