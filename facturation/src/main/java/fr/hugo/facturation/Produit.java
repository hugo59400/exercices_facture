package fr.hugo.facturation;

public class Produit 
{
    private String nom;
    private int prixHT; // en centimes
    private String code;
    private CategorieProduit categorieProduit;

    public Produit(String nom, int prixHT, String code, CategorieProduit categorieProduit)
    {
        this.nom = nom;
        this.prixHT = prixHT;
        this.code = code;
        this.categorieProduit = categorieProduit;
    }

    public int getPrixHT()
    {
        return prixHT;
    }

    public int calculerPrixTTC()
    {
        return (int) ((double) prixHT * categorieProduit.getTVA());
    }
}
