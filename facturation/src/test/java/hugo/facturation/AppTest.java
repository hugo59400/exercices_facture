package hugo.facturation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.hugo.facturation.CategorieProduit;
import fr.hugo.facturation.Client;
import fr.hugo.facturation.Facture;
import fr.hugo.facturation.Particulier;
import fr.hugo.facturation.Produit;

public class AppTest 
{
     
    @Test
    public void devraitRepondreVraiAfficher100()
    {
        Produit produit = new Produit("produit1", 10, "code", new CategorieProduit(20));
        Facture facture = new Facture( "1", "03-12-2020", new Particulier("hugo.coleau"));
        facture.ajouterProduit(produit, 10);

        int prixTotal = facture.calculerPrixTotalHT();

        assertEquals("Le prix Total vaut 100 euros", 100, prixTotal);
    }




    @Test
    public void calculerPrixTotalHTAvec0Produitsdonc0Euros()
    {
        Produit produit = new Produit("Produit1", 5, "code", new CategorieProduit(20));
        Facture facture = new Facture("1", "03-12-2020", new Particulier("hugo"));
        facture.ajouterProduit(produit, 0);

        int prixTotal = facture.calculerPrixTotalHT();

        assertEquals("Le prix total = 0 euros", 0, prixTotal);
    }



    @Test
    public void calculerPrixTotalHTDevraitAfficherAvec0EurosEnSortie()
    {
        Produit produit = new Produit("Produit", 0, "code", new CategorieProduit(20));
        Facture facture = new Facture("1", "03-12-2020", new Particulier("hugo"));
        facture.ajouterProduit(produit, 80);
    
        int prixTotal = facture.calculerPrixTotalHT();
        assertEquals("Le prix total doit être de 0 euros", 0, prixTotal);
    }

   
    @Test
    public void calculerPrixTotalHTAvecPlusieursProduitsDoitAfficher900()
    {
        Produit produit = new Produit("Produit", 5, "code ", new CategorieProduit(20));
        Facture facture = new Facture("1", "03-12-2020", new Particulier("hugo"));
        facture.ajouterProduit(produit, 100);
        produit = new Produit("montre", 400, "code", new CategorieProduit(20));
        facture.ajouterProduit(produit, 1);
        produit = new Produit("livre", 5, "code", new CategorieProduit(20));
        int prixTotal = facture.calculerPrixTotalHT();
        assertEquals("Le prix total doit être de 900 euros", 900, prixTotal);

    }


public void ClientDoitAvoir1() {
    
}















}















































   

