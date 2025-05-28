
import java.util.*;

public class DinoDAO implements DAO<Dinosauro>{
    
    private List<Dinosauro> dinosauri = new ArrayList<>();
    
    @Override
    public Dinosauro trova(String nome){
        for (int i = 0; i < dinosauri.size(); i++) {
            Dinosauro dino = dinosauri.get(i);
            if (dino.nome == nome) {
                return dino;
            }
        }
        System.out.println("Il dinosauro non è presente nel database");
        return null;
    }

    @Override
    public void nutri(Dinosauro dinoDaNutrire){
        if (dinoDaNutrire.stato == "affamato") {
            System.out.println(dinoDaNutrire.nome +" si sta cibando");
            dinoDaNutrire.stato = "normale";
        } else{
            System.out.println("Il dinosauro non è affamato");
        }
        return;
    }

    @Override
    public void cura(Dinosauro dinoDaCurare){
        if (dinoDaCurare.stato == "ammalato") {
            System.out.println(dinoDaCurare.nome +" sta venendo curato");
            dinoDaCurare.stato = "normale";
        } else{
            System.out.println("Il dinosauro non ha bisogno di essere curato");
        }
        return;
    }

    @Override
    public void vendi(Dinosauro dinoDaVendere){
        dinosauri.remove(dinoDaVendere);
        return;
    }

}