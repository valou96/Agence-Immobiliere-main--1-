public class PieceTrapezoidale extends Piece {
    private double _grandebase;
    private double _petitbase;
    private double _hauteur;

    public PieceTrapezoidale(TypePiece typePiece, String niveau, double uneGrandeBase, double unePetitBase,
            double uneHauteur) {
        super(typePiece, niveau);
        this._grandebase = uneGrandeBase;
        this._petitbase = unePetitBase;
        this._hauteur = uneHauteur;
    }

    @Override
    public double surface() {
        double result = 0;
        result = (_grandebase + _petitbase) * _hauteur * 1 / 2;
        return result;
    }

}
