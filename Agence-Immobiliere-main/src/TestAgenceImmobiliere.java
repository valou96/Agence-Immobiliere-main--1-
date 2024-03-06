import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class TestAgenceImmobiliere {
    private static final double DELTA = 1e-2;

    // @Test
    // public void TestpieceCirculaire() {
    // DecimalFormat numberFormat = new DecimalFormat("#.0");
    // TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
    // PieceCirculaire pieceCirculaire = new PieceCirculaire(chambre, "0", 4);
    // assertEquals(50.2, numberFormat.format(pieceCirculaire.surface()), DELTA);
    // }

    @Test
    public void TestpieceParallelogramme() {
        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        PieceParallelogramme pieceParallelogramme = new PieceParallelogramme(chambre, "0", 4, 5);
        assertEquals(20.0, pieceParallelogramme.surface(), DELTA);
    }

    @Test
    public void TestpieceQuadrilataire() {
        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        PieceQuadrilatere pieceQuadrilatere = new PieceQuadrilatere(chambre, "0", 5, 7);
        assertEquals(35.0, pieceQuadrilatere.surface(), DELTA);

    }

    @Test
    public void TestTrapezoide() {
        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        PieceTrapezoidale pieceTrapezoidale = new PieceTrapezoidale(chambre, "0", 4, 8, 15);
        assertEquals(90.0, pieceTrapezoidale.surface(), DELTA);
    }

    @Test
    public void TestTriangulaire() {
        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        PieceTriangulaire pieceTriangulaire = new PieceTriangulaire(chambre, "0", 5, 7);
        assertEquals(17.5, pieceTriangulaire.surface(), DELTA);
    }

    // @Test
    // public void TestSurfaceHabitable(){
    // Vendeur vendeur = new Vendeur("Dupuis", "Jean-Claude", "dp.jc@gmail.com",
    // "06.74.74.00.00");
    // BienImmobilier bienImmobilier = new BienImmobilier("16 rue du lac", "ANNECY",
    // "74000", vendeur, 5);
    // }

    @Test
    public void TestSurfaceHabitable() {
        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        TypePiece Cave = new TypePiece(TypePiece.CAVE, false, false);
        Vendeur vendeur = new Vendeur("Dupuis", "Jean-Claude", "dp.jc@gmail.com", "06.74.74.00.00");
        Appartement appartement = new Appartement("16 rue du lac", "ANNECY", "74000", vendeur, "1er étage");
        appartement.ajouterPiece(new PieceQuadrilatere(chambre, "0", 4, 3));
        appartement.ajouterPiece(new PieceQuadrilatere(Cave, "-1", 3, 3));
        assertEquals(12.0, appartement.surfaceHabitable(), DELTA);
        assertEquals(9.0, appartement.surfaceNonHabitable(), DELTA);
    }

    @Test
    public void TypeBien() {
        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        TypePiece Cave = new TypePiece(TypePiece.CAVE, false, false);

        Vendeur vendeur = new Vendeur("Dupuis", "Jean-Claude", "dp.jc@gmail.com", "06.74.74.00.00");

        Appartement appartement = new Appartement("16 rue du lac", "ANNECY", "74000", vendeur, "1er étage");
        appartement.ajouterPiece(new PieceQuadrilatere(chambre, "0", 1, 1));
        assertEquals("T1", appartement.typeBien());

    }

    @Test
    public void prix() {
        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        TypePiece Cave = new TypePiece(TypePiece.CAVE, false, false);

        Vendeur vendeur = new Vendeur("Dupuis", "Jean-Claude", "dp.jc@gmail.com", "06.74.74.00.00");

        Appartement appartement = new Appartement("16 rue du lac", "ANNECY", "74000", vendeur, "1er étage");
        Annonce annonceappartement = new Annonce("AM0922001", "27/09/2022", "Villa familliale", 4860, appartement);
        appartement.ajouterPiece(new PieceQuadrilatere(chambre, "0", 1, 1));
        assertEquals(6075.0, annonceappartement.prix(), DELTA);
    }

}
