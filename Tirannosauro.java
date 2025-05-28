public class Tirannosauro extends Dinosauro{


    //costruttore
    public Tirannosauro(){
        this.specie = "Tirannosaurus Rex";
        this.dieta = "carnivoro";
    }

    @Override
    void infoSpecie(){
        System.out.println("Tyrannosaurus rex o T-Rex, è un genere estinto di dinosauro teropode tirannosauride vissuto nel Cretaceo superiore");
    }
    
}