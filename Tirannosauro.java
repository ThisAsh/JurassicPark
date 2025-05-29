public class Tirannosauro extends Dinosauro{

    //costruttore
    public Tirannosauro(){
        this.setSpecie("Tirannosaurus Rex");
        this.setDieta("carnivoro");
    }

    public Tirannosauro(String nome){
        this.setSpecie("Tirannosaurus Rex");
        this.setDieta("carnivoro");
        this.setNome(nome);
        this.setStato("affamato");
    }

    @Override
    public void infoSpecie(){
        System.out.println("Tyrannosaurus rex o T-Rex, è un genere estinto di dinosauro teropode tirannosauride vissuto nel Cretaceo superiore");
    }
    
}