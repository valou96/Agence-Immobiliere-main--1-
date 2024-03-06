public class Annonce {
    private String _reference;
    private String _date;
    private String _titre;
    private double _prixM2Habitable;
    private BienImmobilier _logement;
    private static double COEF_NON_HABITABLE = 0.25;

    public Annonce(String uneReference, String uneDate, String unTitre, double unPrixM2Habitable,
            BienImmobilier unLogement) {
        this._reference = uneReference;
        this._date = uneDate;
        this._titre = unTitre;
        this._prixM2Habitable = unPrixM2Habitable;
        this._logement = unLogement;

    }

    public double prix() {
        double result = 0;
        result = _logement.surfaceHabitable() * _prixM2Habitable + _logement.surfaceNonHabitable()
                + _prixM2Habitable * COEF_NON_HABITABLE;
        return result;
    }

    @Override
    public String toString() {
        String result;
        result = _titre + "\n" + " Annonce " + _reference + " du " + _date + "\n" + _logement.toString()
                + _logement.surfaceHabitable()
                + _logement.surfaceNonHabitable() + "\n"
                + "-Prix du m2 habitable: " + _prixM2Habitable + "\n" + "-Prix de m2 non habitable:"
                + (_prixM2Habitable * COEF_NON_HABITABLE) + "\n" + "Valeur du bien: " + prix() + "\n" + " Contact: "
                + _logement.get_vendeur().getEmail() + " / " + _logement.get_vendeur().getNumeroTelephone();
        return result;
    }
}
