public class Pterodattilo extends Dinosauro{

    private int aperturaAlare;

    // Costruttore
    public Pterodattilo(int aperturaAlare) 
    {
        this.specie = "Pterodattilo";
        this.aperturaAlare = aperturaAlare;
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
}