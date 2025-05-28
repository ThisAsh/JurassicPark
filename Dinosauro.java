public abstract class Dinosauro
{
    //attributi
    String nome;
    int età;
    String specie;
    String stato;
    String dimensione;
    String dieta;

    //metodi
    public Dinosauro()
    {
        //attributi di default in caso non vengano dati alla creazione dell'istanza
        this.nome = "non dato";
        this.età = 0;
        this.specie = "non dato";
        this.stato = "non dato";
        this.dimensione = "non dato";
        this.dieta = "non dato"; 
    }

    void printinfo()
    {
        System.out.println("Nome: "+this.nome);
        System.out.println("Età: "+this.età); //todo: capire come stampare à
        System.out.println("Specie: "+this.specie);
        System.out.println("Stato: "+this.stato);
        System.out.println("Dimensione: "+this.dimensione);
        System.out.println("Dieta: "+this.dieta);
    }

    //metodi getter
    String getNome(){return this.nome;}
    int getEtà(){return this.età;}
    String getSpecie(){return this.specie;}
    String getStato(){return this.stato;}
    String getDimensione(){return this.dimensione;}
    String getDieta(){return this.dieta;}

    //metodi astratti
    abstract void infoSpecie();

}
