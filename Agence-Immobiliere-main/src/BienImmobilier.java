import java.text.DecimalFormat;
import java.util.ArrayList;

public abstract class BienImmobilier {
    private String _rue;
    private String _ville;
    private String _codePostal;
    private Vendeur _vendeur;
    protected ArrayList<Piece> _piece;

    public BienImmobilier(String rue, String ville, String codePostal, Vendeur vendeur) {
        this._rue = rue;
        this._ville = ville;
        this._codePostal = codePostal;
        this._vendeur = vendeur;
        this._piece = new ArrayList<Piece>();
    }

    // calcule la surface habitable totale du bien immobilier.
    // result: Un double représentant la surface habitable totale en mètres carrés.
    public double surfaceHabitable() {
        double result = 0;
        for (Piece piece : _piece) {
            if (piece.get_typePiece().isSurfaceHabitable()) {
                result += piece.surface();
            }

        }
        return result;
    }

    // calcule la surface non habitable totale du bien immobilier.
    // result : un double représentant la surface non habitable totale en mètres
    // carrés.
    public double surfaceNonHabitable() {
        double result = 0;
        for (Piece piece : _piece) {
            if (piece.get_typePiece().isSurfaceHabitable() == false) {
                result += piece.surface();
            }

        }
        return result;
    }
    // ajoute une pièce à la collection de pièces du bien immobilier.

    public void ajouterPiece(Piece piece) {
        if (piece != null) {
            _piece.add(piece);
        }
    }

    // convertit l'objet BienImmobilier en une chaîne de caractères résumant ses
    // informations principales.
    // result: Une chaîne de caractères contenant la localisation, la description
    // des pièces, la surface habitable et non habitable du bien.
    @Override
    public String toString() {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        return "\nLocalisation : " + _rue + " " + _codePostal + " " + _ville +
                "\n \n Description du bien : \n" +
                _piece.toString() +
                "\nPour une surface habitable de : " +
                numberFormat.format(surfaceHabitable()) +
                " m2 et une surface non habitable de : " +
                numberFormat.format(surfaceNonHabitable()) + " m2.";

    }

    public Vendeur get_vendeur() {
        return _vendeur;
    }

}
