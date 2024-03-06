public class Appartement extends BienImmobilier {
    private String _etage;
    private boolean _ascenseur;

    public Appartement(String rue, String ville, String codePostal, Vendeur vendeur, String unEtage) {
        super(rue, ville, codePostal, vendeur);
        this._etage = unEtage;

    }

    public Appartement(String rue, String ville, String codePostal, Vendeur vendeur, String unEtage,
            boolean unAscenseur) {
        super(rue, ville, codePostal, vendeur);
        this._etage = unEtage;
        this._ascenseur = unAscenseur;

    }

    public String typeBien() {
        int nbPiece = 0;
        for (Piece piece : _piece) {
            if (piece.get_typePiece().isPiece()) {
                nbPiece++;
            }

        }
        if (nbPiece > 7) {
            return "T7+";
        }
        return "T" + nbPiece;

    }

    @Override
    public String toString() {
        String resultat = "";
        resultat = "Appartement de type " + typeBien();
        if (_ascenseur) {
            resultat += " avec ascenseur ";
        }
        resultat += " situé au " + _etage + " ";
        resultat += super.toString();
        return resultat;
    }

}
