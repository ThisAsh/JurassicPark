public class Pterodattilo extends Dinosauro{

    private double aperturaAlare;

    // Costruttore
    public Pterodattilo(double aperturaAlare) 
    {
        this.setSpecie("Pterodattilo");
        this.setDieta("onnivoro");
        this.aperturaAlare = aperturaAlare;
    }

    public Pterodattilo() 
    {
        this.setSpecie("Pterodattilo");
        this.setDieta("onnivoro");
    }

    @Override
    public void infoSpecie()
    {
        //chi sei ?
    }

}