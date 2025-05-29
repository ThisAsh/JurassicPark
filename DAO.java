/**
 * Classe Dao (Data Access Object) generica per la gestione
 * di un gruppo di animali.
 */

public interface DAO<A>{
    //metodi astratti che verranno implementati da un altra classe

    A trova(String nome); //read

    void nutri(A animaleDaNutrire); //update

    void cura(A animaleDaCurare); //update

    void vendi(A animaleDaVendere); //delete

    void aggiungi(A animaleDaAggiungere); //create

}