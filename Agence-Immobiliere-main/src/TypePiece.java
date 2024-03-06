public class TypePiece {
    public static final String CUISINE = "Cuisine";
    public static final String CHAMBRE = "Chambre";
    public static final String SALON = "Salon";
    public static final String SALLE_DE_BAIN = "Salle de bain";
    public static final String WC = "Wc";
    public static final String GARAGE = "Garage";
    public static final String CAVE = "Cave";

    private String nom;
    private boolean surfaceHabitable;
    private boolean piece;

    public TypePiece(String nom, boolean surfaceHabitable, boolean piece) {
        this.nom = nom;
        this.surfaceHabitable = surfaceHabitable;
        this.piece = piece;
    }

    public String getNom() {
        return nom;
    }

    public boolean isSurfaceHabitable() {
        return surfaceHabitable;
    }

    public boolean isPiece() {
        return piece;
    }

    @Override
    public String toString() {
        return nom;
    }

}