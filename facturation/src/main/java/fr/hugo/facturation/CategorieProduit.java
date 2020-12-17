package fr.hugo.facturation;

public class CategorieProduit 
{
    //variable d'instance 
    private int tva;

    //constructeur 
    public CategorieProduit(int tva)
    {
        this.tva = tva;
    }

    //getter de tva 

    public int getTVA()
    {
        return tva;
    }
}
