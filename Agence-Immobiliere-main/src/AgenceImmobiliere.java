public class AgenceImmobiliere {
    public static void main(String[] args) throws Exception {
        // Déclaration des différents types de pièce permettant de décrire un bien
        // immobilier.
        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        TypePiece salon = new TypePiece(TypePiece.SALON, true, true);
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        TypePiece salleDeBain = new TypePiece(TypePiece.SALLE_DE_BAIN, true, false);
        TypePiece Wc = new TypePiece(TypePiece.WC, true, false);
        TypePiece Garage = new TypePiece(TypePiece.GARAGE, false, false);
        TypePiece Cave = new TypePiece(TypePiece.CAVE, false, false);

        // Création d'un vendeur
        Vendeur vendeur = new Vendeur("Dupuis", "Jean-Claude", "dp.jc@gmail.com", "06.74.74.00.00");

        // Création d'un nouveau bien immobilier : Appartement
        Appartement appartement = new Appartement("16 rue du lac", "ANNECY", "74000", vendeur, "1er étage");
        appartement.ajouterPiece(new PieceQuadrilatere(chambre, "0", 4, 3));
        appartement.ajouterPiece(new PieceTriangulaire(cuisine, "0", 6, 2.3));
        appartement.ajouterPiece(new PieceCirculaire(salon, "0", 2.1));
        appartement.ajouterPiece(new PieceQuadrilatere(Wc, "0", 1.5, 2));
        appartement.ajouterPiece(new PieceQuadrilatere(salleDeBain, "0", 2, 2));
        appartement.ajouterPiece(new PieceQuadrilatere(Cave, "-1", 3, 3));
        // Création de l'annonce associée au bien immobilier : Appartement
        Annonce annonceAppartement = new Annonce("AA0922001", "27/09/2022", "Appartement avec vue sur le Lac d'Annecy",
                6380, appartement);

        // Création d'un nouveau bien immobilier : Maison
        Maison maison = new Maison("155 route du lac", "ANNECY", "74000", vendeur, 875);
        maison.ajouterPiece(new PieceTriangulaire(chambre, "0", 6.2, 4.5));
        maison.ajouterPiece(new PieceTriangulaire(chambre, "1", 3.8, 6));
        maison.ajouterPiece(new PieceQuadrilatere(chambre, "1", 5.8, 2.8));
        maison.ajouterPiece(new PieceQuadrilatere(cuisine, "0", 6, 3.5));
        maison.ajouterPiece(new PieceQuadrilatere(salon, "0", 6.9, 4.4));
        maison.ajouterPiece(new PieceQuadrilatere(Wc, "0", 1.5, 2));
        maison.ajouterPiece(new PieceQuadrilatere(Wc, "1", 2.1, 2));
        maison.ajouterPiece(new PieceTrapezoidale(salleDeBain, "0", 2.6, 3.2, 3.1));
        maison.ajouterPiece(new PieceQuadrilatere(salleDeBain, "1", 2.6, 3));
        maison.ajouterPiece(new PieceQuadrilatere(Cave, "-1", 3, 4.2));
        maison.ajouterPiece(new PieceParallelogramme(Garage, "0", 5, 5.8));
        // Création de l'annonce associée au bien immobilier : Maison
        Annonce annonceMaison = new Annonce("AM0922001", "27/09/2022", "Villa familliale", 4860, maison);

        // Affichage des annonces
        System.out.println(annonceAppartement);
        System.out.println(annonceMaison);
    }
}
