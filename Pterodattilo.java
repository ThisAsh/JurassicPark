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
        this.setStato("ammalato");
    }

    @Override
    public void infoSpecie()
    {
        System.out.println("Pterodactylus (dal greco πτέροv ptéron che significa ‘penna, ala’, e δάκτυλος dáktylos che significa ‘dito’, quindi ‘dalle dita alate’; Cuvier, 1809), in italiano comunemente noto come pterodattilo, è un estinto genere di pterosauro, i cui membri sono popolarmente chiamati pterodattili. Attualmente, il genere contiene una singola specie, Pterodactylus antiquus, che oltre ad essere la specie tipo è anche il primissimo genere di pterosauro mai rinvenuto.");
    }

}