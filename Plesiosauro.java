public class Plesiosauro extends Dinosauro implements Acquatico{

    // Costruttore
    public Plesiosauro(double dimensione) 
    {
        this.specie = "Plesiosauro";
    }

    @Override
    void infoSpecie()
    {
        //chi sei ?
    }

    @Override
    void feed() 
    {
        //mangia bastardo
    }

    @Override
    void fish(){
        System.out.println(this.nome + " sta insegueno dei pesci");
        return;
    }
}