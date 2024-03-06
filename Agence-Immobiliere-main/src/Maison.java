public class Maison extends BienImmobilier {
    private double _surfaceTerrain;
    private boolean _piscine;

    public Maison(String rue, String ville, String codePostal, Vendeur vendeur, double uneSurfaceTerrain) {
        super(rue, ville, codePostal, vendeur);
        this._surfaceTerrain = uneSurfaceTerrain;

    }

    public Maison(String rue, String ville, String codePostal, Vendeur vendeur, double uneSurfaceTerrain,
            boolean unePiscine) {
        super(rue, ville, codePostal, vendeur);
        this._surfaceTerrain = uneSurfaceTerrain;
        this._piscine = false;

    }

    @Override
    public String toString() {
        String resultat = "";
        resultat = "Maison individuelle ";
        resultat += "avec son terrain de " + _surfaceTerrain + "m2";
        if (_piscine) {
            resultat += " et sa piscine";
        }
        resultat += ". " + super.toString();
        return resultat;
    }

}
