public class Plesiosauro extends Dinosauro{

    // Costruttore
    public Plesiosauro(double dimensione) 
    {
        this.setSpecie("Plesiosauro");
        this.setDieta("piscivoro");
    }

    public Plesiosauro(String nome) 
    {
        this.setSpecie("Plesiosauro");
        this.setDieta("piscivoro");
        this.setNome(nome);
    }

    @Override
    public void infoSpecie()
    {
        //chi sei ?
    }

}