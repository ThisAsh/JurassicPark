/**
 * Contiene gli attributi di un dinosauro generico, un costruttore con gli attributi di default, vari metodi getter e setter 
 * e un metodo astratto per stampare le informazioni relative alla specie.
 * 
 */
public abstract class Dinosauro
{
    //attributi
    private String nome;
    private int età;
    private String specie;
    private String stato;
    private String dimensione;
    private String dieta;

    //costruttore
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

    

    //metodi getter
    String getNome(){return this.nome;}
    int getEtà(){return this.età;}
    String getSpecie(){return this.specie;}
    String getStato(){return this.stato;}
    String getDimensione(){return this.dimensione;}
    String getDieta(){return this.dieta;}

    //metodi setter
    public void setStato(String stato) {this.stato = stato;}
    public void setSpecie(String specie) {this.specie = specie;}
    public void setDieta(String dieta) {this.dieta = dieta;}

    //metodi
    public void printInfo()
    {
        System.out.println("Nome: "+this.nome);
        System.out.println("Età: "+this.età); //todo: capire come stampare à
        System.out.println("Specie: "+this.specie);
        System.out.println("Stato: "+this.stato);
        System.out.println("Dimensione: "+this.dimensione);
        System.out.println("Dieta: "+this.dieta);
    }

    //metodi astratti
    abstract void infoSpecie();
}
