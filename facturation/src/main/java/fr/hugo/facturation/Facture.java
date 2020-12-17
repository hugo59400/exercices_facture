package fr.hugo.facturation;

import java.util.HashMap;
import java.util.Map;

public class Facture 
{
    //variables d'instance 
    private String id;
    private String date;
    private Client client;
    private HashMap<Produit,Integer> listeProduits = new HashMap<>();

    

    //constructeur 
    public Facture(String id, String date, Client client)
    {
        this.id = id;
        this.date = date;
        this.client = client;
    }
    
    public int calculerPrixTotal()
    {
        int prixTotal = 0;
        for(Map.Entry<Produit,Integer> produit : listeProduits.entrySet())
        {
            prixTotal += produit.getKey().calculerPrixTTC() * produit.getValue();
        }
        return prixTotal;
    }

    public int calculerPrixTotalHT()
    {
        int prixTotalHT = 0;
        for(Map.Entry<Produit,Integer> produit : listeProduits.entrySet())
        {
            prixTotalHT += produit.getKey().getPrixHT() * produit.getValue();
        }
        return prixTotalHT;
    }

    public void ajouterProduit(Produit produit, int quantiteDuProduit)
    {  
        listeProduits.put(produit, quantiteDuProduit);
    }

    public void retirerProduit(Produit produit)
    {
        listeProduits.remove(produit);
    }

}

