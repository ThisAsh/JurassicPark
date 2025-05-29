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
        System.out.println("I plesiosauri (Plesiosauria) sono un gruppo di rettili acquatici vissuti tra il Triassico superiore e il Cretaceo superiore, divenendo particolarmente comuni nel corso del Giurassico. Essi hanno conteso il predominio dei mari del Mesozoico agli altri rettili marini, come gli Ittiosauri. Si estinsero alla fine del Cretaceo, a causa dell'evento di estinzione noto come K-T, insieme a moltissimi altri gruppi di rettili.");
    }

}