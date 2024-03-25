public abstract class Piece {
    private TypePiece _typePiece;
    private String _niveau;

    public Piece(TypePiece typePiece, String niveau) {
        this._typePiece = typePiece;
        this._niveau = niveau;

    }

    public abstract double surface();

    // convertit l'objet Piece en une chaîne de caractères résumant ses informations
    // principales.
    // result: Une chaîne de caractères contenant le type de la pièce, sa surface et
    // des explications sur la construction de la chaîne.
    @Override
    public String toString() {
        String result;
        result = _typePiece + " surface: " + surface() + " m2 \n" + " où " + _typePiece + " est le nom de type pièce, "
                + surface() + " le résultat de la méthode de calcul de la surface. ";
        return result;
    }

    public TypePiece get_typePiece() {
        return _typePiece;
    }

    public String get_niveau() {
        return _niveau;
    }

}
