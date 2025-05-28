public class Pterodattilo extends Dinosauro{

    private double aperturaAlare;

    // Costruttore
    public Pterodattilo(double aperturaAlare) 
    {
        this.setSpecie("Pterodattilo");
        this.setDieta("onnivoro");
        this.aperturaAlare = aperturaAlare;
    }

    @Override
    void infoSpecie()
    {
        //chi sei ?
    }

}