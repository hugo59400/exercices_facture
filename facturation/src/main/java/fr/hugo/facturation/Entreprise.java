package fr.hugo.facturation;

public class Entreprise extends Client
{
    //variable d'instance 
    private String siret;
    

    //constructeur 
    public Entreprise(String mail, String siret)
    {
        super(mail);

        this.siret = siret;
    }
}
