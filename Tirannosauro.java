public class Tirannosauro extends Dinosauro{


    //costruttore
    public Tirannosauro(){
        this.setSpecie("Tirannosaurus Rex");
        this.setDieta("carnivoro");
    }

    @Override
    void infoSpecie(){
        System.out.println("Tyrannosaurus rex o T-Rex, è un genere estinto di dinosauro teropode tirannosauride vissuto nel Cretaceo superiore");
    }
    
}