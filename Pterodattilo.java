public class Pterodattilo extends Dinosauro{

    private double aperturaAlare = 2;

    // Costruttore
    public Pterodattilo() 
    {
        this.setSpecie("Pterodattilo");
        this.setDieta("onnivoro");
    }

    public Pterodattilo(String nome) 
    {
        this.setSpecie("Pterodattilo");
        this.setDieta("onnivoro");
        this.setNome(nome);
    }

    @Override
    public void infoSpecie()
    {
        //chi sei ?
    }

}