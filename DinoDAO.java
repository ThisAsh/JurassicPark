/**
 * Classe che implementa un Dao (Data Access Object) generico 
 * e lo applica alla situazione specifica del parco di dinosauri.
 */

import java.util.*;

public class DinoDAO implements DAO<Dinosauro>{
    
    private List<Dinosauro> dinosauri = new ArrayList<>();
    
    @Override
    public Dinosauro trova(String nome){
        for (int i = 0; i < dinosauri.size(); i++) {
            Dinosauro dino = dinosauri.get(i);
            if (dino.getNome().equals(nome)) {
                return dino;
            }
        }
        System.out.println("Il dinosauro non è presente nel database");
        return null;
    }

    @Override
    public void nutri(Dinosauro dinoDaNutrire){
        if (dinoDaNutrire.getStato().equals("affamato")) {
            System.out.println(dinoDaNutrire.getNome() +" si sta cibando");
            dinoDaNutrire.setStato("normale");
        } else{
            System.out.println("Il dinosauro non è affamato");
        }
    }

    @Override
    public void cura(Dinosauro dinoDaCurare){
        if (dinoDaCurare.getStato().equals("ammalato")) {
            System.out.println(dinoDaCurare.getNome() +" sta venendo curato");
            dinoDaCurare.setStato("normale");
        } else{
            System.out.println("Il dinosauro non ha bisogno di essere curato");
        }
    }

    @Override
    public void vendi(Dinosauro dinoDaVendere){
        dinosauri.remove(dinoDaVendere);
    }

    @Override
    public void aggiungi(Dinosauro dinoDaAggiungere){
        dinosauri.add(dinoDaAggiungere);
    }

    //getter
    public List<Dinosauro> getDinosauri() {return dinosauri;}

}